package com.estoque.dao;

import com.estoque.banco.ConexaoBD;
import com.estoque.model.Product;
import com.estoque.model.Providers;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductDao extends ConexaoBD {

    public boolean daoSalveProduct(Providers providers, Product product) {

        String SaveProduct = "call sp_save_product ("
                + "'" + product.getType() + "',"
                + "'" + product.getCategory() + "',"
                + "'" + product.getBrand() + "',"
                + "'" + product.getSize() + "',"
                + "'" + product.getDescription() + "',"
                + "'" + product.getBar_code() + "',"
                + "'" + product.getPrice() + "',"
                + "'" + product.getQtd() + "',"
                + "'" + product.getProviders().getId() + "'"
                + ")";
        try {
            this.getConectar();
            this.executarSql(SaveProduct);
            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        } finally {
            this.getfecharConexao();
        }
    }

    /*  public ArrayList<Product> daoListProduct() {
        ArrayList<Product> listProducts = new ArrayList<>();

        Product product = new Product();

        try {
            this.getConectar();
            this.executarSql("call sp_list_products");
            while (this.getResultSet().next()) {

                product = new Product();

                product.setType(this.getResultSet().getString(1));
                product.setCategory(this.getResultSet().getString(2));
                product.setBrand(this.getResultSet().getString(3));
                product.setSize(this.getResultSet().getString(4));
                product.setDescription(this.getResultSet().getString(5));
                product.setBar_code(this.getResultSet().getString(6));
                product.setPrice(this.getResultSet().getFloat(7));
                product.setQtd(this.getResultSet().getInt(8));
                listProducts.add(product);
            }
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            this.getfecharConexao();
        }
        return listProducts;
    }*/
    public boolean daoUpdateProduct(Product product) {

        String UpdateProduct = "call sp_update_product ("
                + "'" + product.getType() + "',"
                + "'" + product.getCategory() + "',"
                + "'" + product.getBrand() + "',"
                + "'" + product.getSize() + "',"
                + "'" + product.getDescription() + "',"
                + "'" + product.getBar_code() + "',"
                + "'" + product.getPrice() + "',"
                + "'" + product.getQtd() + "'"
                + ")";
        try {
            this.getConectar();
            this.executarSql(UpdateProduct);
            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        } finally {
            this.getfecharConexao();
        }
    }

    public Product buscarCodigoBarra(String Codigo) {
        this.getConectar();
        try {
            String sql = "select p.id, p.type, p.category_name, p.brand, p.size, p.description, p.bar_code, p.price, p.qtdproduct\n"
                    + " from tb_product as p inner join tb_providers as pr on (p.id_providers = pr.id) where p.bar_code = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, Codigo);

            ResultSet rs = stmt.executeQuery();
            Product product = new Product();

            if (rs.next()) {
                product.setId(rs.getInt("id"));
                product.setType(rs.getString("type"));
                product.setCategory(rs.getString("category_name"));
                product.setBrand(rs.getString("brand"));
                product.setSize(rs.getString("size"));
                product.setDescription(rs.getString("description"));
                product.setBar_code(rs.getString("bar_code"));
                product.setPrice(rs.getFloat("price"));
                product.setQtd(rs.getInt("qtdproduct"));
            }

            return product;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não encontrado");
        }
        return null;
    }

}

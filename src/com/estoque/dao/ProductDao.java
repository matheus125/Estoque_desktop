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

    public boolean daoSalveProduct(Product product) {

        String SaveProduct = "call sp_save_product ("
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
            this.executarSql(SaveProduct);
            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        } finally {
            this.getfecharConexao();
        }
    }

    public ArrayList<Product> daoListProduct() {
        ArrayList<Product> listProducts = new ArrayList<>();

        Product product = new Product();

        try {
            this.getConectar();
            this.executarSql("SELECT * FROM tb_product");
            while (this.getResultSet().next()) {

                product = new Product();
                product.setId(this.getResultSet().getInt(1));
                product.setCategory(this.getResultSet().getString(2));
                product.setType(this.getResultSet().getString(3));
                product.setBrand(this.getResultSet().getString(4));
                product.setSize(this.getResultSet().getString(5));
                product.setDescription(this.getResultSet().getString(6));
                product.setBar_code(this.getResultSet().getString(7));
                product.setPrice(this.getResultSet().getFloat(8));
                product.setQtd(this.getResultSet().getInt(9));
                listProducts.add(product);
            }
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            this.getfecharConexao();
        }
        return listProducts;
    }

    public boolean daoUpdateProduct(Product product) {

        String UpdateProduct = "call sp_update_product ("
                + "'" + product.getId() + "',"
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
            String sql = "select id, type, category_name, brand, size, description, bar_code, price, qtdproduct\n"
                    + " from tb_product  where bar_code = ?";
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

    // Metodo para da baixa no estoque
    public void baixarEstoque(int id, int qtd_nova) {
        this.getConectar();
        try {
            String sql = "update tb_product set qtdproduct = ? where id =?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, qtd_nova);
            stmt.setInt(2, id);
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
    }

    //Metodo que retorna o estoque atual de um produto
    public int retornarEstoqueAtual(int id) {
        this.getConectar();
        try {
            int qtdproduct = 0;

            String sql = "select qtdproduct from tb_product where id = ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                qtdproduct = (rs.getInt("qtdproduct"));
            }
            return qtdproduct;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean daoDeleteCliente(int codigo) {
        String comandoDelete = "call sp_delete_product(" + codigo + ");";
        try {
            this.getConectar();
            this.executarSql(comandoDelete);
            return true;
        } catch (Exception erro) {
            System.out.println("Erro: " + erro.getMessage());
            return false;
        } finally {
            this.getfecharConexao();
        }
    }
}

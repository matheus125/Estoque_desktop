package com.estoque.dao;

import com.estoque.banco.ConexaoBD;
import com.estoque.model.Product;
import com.estoque.model.Providers;
import java.sql.SQLException;
import java.util.ArrayList;


public class ProductDao extends ConexaoBD {

    public boolean daoSalveProduct(Providers providers, Product product) {

        String SaveProduct = "call sp_save_product ("
                + "'" + product.getCategory() + "',"
                + "'" + product.getType() + "',"
                + "'" + product.getBrand() + "',"
                + "'" + product.getSize() + "',"
                + "'" + product.getDescription() + "',"
                + "'" + product.getBar_code() + "',"
                + "'" + product.getPrice() + "',"
                + "'" + product.getProviders() + "'"
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
                + "'" + product.getCategory()+ "',"
                + "'" + product.getBrand() + "',"
                + "'" + product.getSize() + "',"
                + "'" + product.getDescription() + "',"
                + "'" + product.getBar_code() + "',"
                + "'" + product.getPrice() + "',"
                + "'" + product.getQtd()+ "'"
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
}

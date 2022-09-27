package com.estoque.dao;

import com.estoque.banco.ConexaoBD;
import com.estoque.model.Category;
import com.estoque.model.Product;

public class ProductDao extends ConexaoBD {

    public boolean daoSalveProduct(Category category, Product product) {

        String SalveProduct = "call sp_save_product ("
                + "'" + category.getCategory_name()+ "',"
                + "'" + product.getType() + "',"
                + "'" + product.getBrand()+ "',"
                + "'" + product.getColor() + "',"
                + "'" + product.getSize() + "',"
                + "'" + product.getDescription() + "',"
                + "'" + product.getCode()+ "',"
                + "'" + product.getBar_code() + "',"
                + "'" + product.getPrice() + "'"
                + ")";
        try {
            this.getConectar();
            this.executarSql(SalveProduct);
            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        } finally {
            this.getfecharConexao();
        }
    }
    
    
}

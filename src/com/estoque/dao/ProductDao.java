package com.estoque.dao;

import com.estoque.banco.ConexaoBD;
import com.estoque.model.Category;
import com.estoque.model.Inventory;
import com.estoque.model.Product;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDao extends ConexaoBD {

    public boolean daoSalveProduct(Category category, Product product, Inventory inventory) {

        String SaveProduct = "call sp_save_product ("
                + "'" + category.getCategory_name() + "',"
                + "'" + product.getType() + "',"
                + "'" + product.getBrand() + "',"
                + "'" + product.getSize() + "',"
                + "'" + product.getDescription() + "',"
                + "'" + product.getBar_code() + "',"
                + "'" + product.getPrice() + "',"
                + "'" + inventory.getQtdproduct() + "'"
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

    public ArrayList<Inventory> daoListProduct() {
        ArrayList<Inventory> listProducts = new ArrayList<>();
        Category category = new Category();
        Product product = new Product();
        Inventory inventory = new Inventory();

        try {
            this.getConectar();
            this.executarSql("select i.id_product , c.category_name, p.type, p.brand, p.size, p.description, p.bar_code, p.price, i.qtdproduct from tb_category c inner join tb_product p on c.id = p.id_category inner join tb_inventory i on p.id = i.id_product");
            while (this.getResultSet().next()) {
                category = new Category();
                product = new Product();
                inventory = new Inventory();

                category.setId(this.getResultSet().getInt(1));
                category.setCategory_name(this.getResultSet().getString(2));

                product.setType(this.getResultSet().getString(3));
                product.setBrand(this.getResultSet().getString(4));
                product.setSize(this.getResultSet().getString(5));
                product.setBar_code(this.getResultSet().getString(6));
                product.setPrice(this.getResultSet().getFloat(7));
                product.setDescription(this.getResultSet().getString(8));
                
                product.setCategory(category);

                inventory.setQtdproduct(this.getResultSet().getInt(9));

                inventory.setProduct(product);
                listProducts.add(inventory);
            }
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            this.getfecharConexao();
        }
        return listProducts;
    }
}

package com.estoque.controller;

import com.estoque.dao.ProductDao;
import com.estoque.model.Product;
import java.util.ArrayList;
import com.estoque.model.Providers;

public class ControllerProduct {

    ProductDao productDao = new ProductDao();

    public boolean controlSaveProduct(Providers providers, Product product) {
        return this.productDao.daoSalveProduct(providers, product);
    }

    public boolean controlUpdateProduct(Product product) {
        return this.productDao.daoUpdateProduct(product);
    }

    /*public ArrayList<Product> returnListProductController() {
        return this.productDao.daoListProduct();
    }*/
    public Product controlBuscarProdutoPorID(String Codigo) {
        return this.productDao.buscarCodigoBarra(Codigo);
    }

}

package com.estoque.controller;

import com.estoque.dao.ProductDao;
import com.estoque.model.Category;
import com.estoque.model.Inventory;
import com.estoque.model.Product;

public class ControllerProduct {
    
    ProductDao productDao = new ProductDao();
    
    public boolean controlSaveProduct (Category category, Product product, Inventory inventory) {
    
    return this.productDao.daoSalveProduct(category, product, inventory);
    }
    
}

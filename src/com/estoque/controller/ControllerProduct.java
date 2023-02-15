package com.estoque.controller;

import com.estoque.dao.ProductDao;
import com.estoque.model.Produto;
import java.util.ArrayList;
import com.estoque.model.Fornecedores;

public class ControllerProduct {

    ProductDao productDao = new ProductDao();

    public boolean controlSaveProduct(Produto product) {
        return this.productDao.daoSalveProduct(product);
    }

    public boolean controlUpdateProduct(Produto product) {
        return this.productDao.daoUpdateProduct(product);
    }

    public ArrayList<Produto> returnListProductController() {
        return this.productDao.daoListProduct();
    }
    //delete cliente
    public boolean controlDeleteCliente(int codigo){
        return this.productDao.daoDeleteCliente(codigo);
    }
    
    public Produto controlBuscarProdutoPorID(String Codigo) {
        return this.productDao.buscarCodigoBarra(Codigo);
    }

}

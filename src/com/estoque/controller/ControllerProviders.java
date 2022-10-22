/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estoque.controller;

import com.estoque.dao.ProvidersDao;
import com.estoque.model.Providers;
import java.util.ArrayList;

/**
 *
 * @author Matheus
 */
public class ControllerProviders {

    ProvidersDao providersDao = new ProvidersDao();

    public boolean controlSaveProviders(Providers providers) {
        return this.providersDao.daoSalveProviders(providers);
    }

    //lista cliente
   

    //selecionar cliente
    public Providers controlRecuperarCliente(String name) {
        return this.providersDao.querybyName(name);
    }

}

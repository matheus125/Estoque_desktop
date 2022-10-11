/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estoque.controller;

import com.estoque.dao.FuncionarioDao;
import com.estoque.model.Employees;
import com.estoque.model.User;
import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class ControllerFuncionario {
    
    FuncionarioDao funcionarioDao = new FuncionarioDao();
    
    public boolean controlSalvarFuncionario (Employees employees, User user) {
        return this.funcionarioDao.daoSalvarFuncionario(employees, user);
    }
    
     
   /* public ArrayList<ModelFuncionarios> controlGetListarFuncionarios(){
        return this.funcionarioDao.daoGetListarClientes();
    }
*/
}

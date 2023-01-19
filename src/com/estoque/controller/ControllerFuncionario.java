/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estoque.controller;

import com.estoque.dao.FuncionarioDao;
import com.estoque.model.Funcionarios;
import com.estoque.model.User;
import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class ControllerFuncionario {

    FuncionarioDao employeesDao = new FuncionarioDao();

    public boolean controlSaveemployees(Funcionarios employees, User user) {
        return this.employeesDao.daoFuncionarios(employees, user);
    }
    
     public boolean controlUpdateemployees(Funcionarios employees, User user) {
        return this.employeesDao.daoUpdateemployees(employees, user);
    }
     
    public ArrayList<User> returnListEmployeesController() {
        return this.employeesDao.daoListemployees();
    }
}

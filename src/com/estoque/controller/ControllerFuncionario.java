/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estoque.controller;

import com.estoque.dao.EmployeesDao;
import com.estoque.model.Employees;
import com.estoque.model.User;
import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class ControllerFuncionario {
       
    EmployeesDao employeesDao = new EmployeesDao();
   
    public ArrayList<User> returnListEmployeesController () {
        return this.employeesDao.daoListemployees();
    }
    
    public boolean controlSaveemployees (Employees employees, User user) {
        return this.employeesDao.daoSaveemployees(employees, user);
    }
}

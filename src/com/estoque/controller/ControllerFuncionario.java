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

    FuncionarioDao funcionariosDao = new FuncionarioDao();

    //salvar funcionarios
    public boolean controlSaveemployees(Funcionarios employees, User user) {
        return this.funcionariosDao.daoFuncionarios(employees, user);
    }

    //update funcionarios
    public boolean controlUpdateemployees(Funcionarios employees, User user) {
        return this.funcionariosDao.daoUpdateemployees(employees, user);
    }

    //listar funcionarios
    public ArrayList<User> returnListEmployeesController() {
        return this.funcionariosDao.daoListemployees();
    }

    //delete funcionarios
    public boolean controlDeleteFuncionarios(int codigo) {
        return this.funcionariosDao.daoDeleteFuncionario(codigo);
    }
}

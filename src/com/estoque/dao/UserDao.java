package com.estoque.dao;

import com.estoque.banco.ConexaoBD;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import view.com.raven.main.Main;

public class UserDao extends ConexaoBD {

    public void efetuarLogin(String login, String password) {

        try {
            this.getConectar();
            this.executarSql("select login, password from tb_user where login = '" + login + "'and password = '" + password + "'");

            if (getResultSet().next()) {
                JOptionPane.showMessageDialog(null, "Seja bem vindo ao Sistema");
                Main main = new Main();
                main.usuário = getResultSet().getString("login");
                main.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Dados incorretos!");
            }

        } catch (Exception e) {
        }

    }

}

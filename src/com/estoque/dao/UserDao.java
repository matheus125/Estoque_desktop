/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estoque.dao;

import com.estoque.banco.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class UserDao extends ConexaoBD {

    public void buscarUserID(int id) {
        this.getConectar();
        this.executarSql("select * from tb_user order by id desc limit 1;");

        try {
            this.getResultSet();

            do {
                id = Integer.parseInt(this.rs.getString("id"));
            } while (this.getResultSet().next());

        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta /nErro!" + e);
        }
    }

}

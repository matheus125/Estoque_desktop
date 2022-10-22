/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estoque.dao;

import com.estoque.banco.ConexaoBD;
import com.estoque.model.Providers;


/**
 *
 * @author Matheus
 */
public class ProvidersDao extends ConexaoBD {

    public boolean daoSalveProviders(Providers providers) {

        String SaveProduct = "call sp_save_providers ("
                + "'" + providers.getCnpj()+ "',"
                + "'" + providers.getName() + "',"
                + "'" + providers.getEmail() + "',"
                + "'" + providers.getPhone() + "'"
                + ")";
        try {
            this.getConectar();
            this.executarSql(SaveProduct);
            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        } finally {
            this.getfecharConexao();
        }
    }

}

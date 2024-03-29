package com.estoque.dao;

import com.estoque.banco.ConexaoBD;
import com.estoque.model.Fornecedores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProvidersDao extends ConexaoBD {

    public boolean daoSalveProviders(Fornecedores providers) {

        String SaveProduct = "call sp_save_providers ("
                + "'" + providers.getCnpj() + "',"
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

    public ArrayList<Fornecedores> daoListProviders() {
        ArrayList<Fornecedores> listProviders = new ArrayList<>();
        String comandoSql = "select id, name, cnpj, email, phone from tb_providers";
        try {
            this.getConectar();
            this.executarSql(comandoSql);
            while (this.getResultSet().next()) {
                Fornecedores providers = new Fornecedores();
                providers.setId(this.getResultSet().getInt(1));
                providers.setCnpj(this.getResultSet().getString(2));
                providers.setName(this.getResultSet().getString(3));
                providers.setEmail(this.getResultSet().getString(4));
                providers.setPhone(this.getResultSet().getString(5));
                listProviders.add(providers);
            }
        } catch (SQLException erro) {
            System.out.println("Erro" + erro.getMessage());
            System.out.println("Erro" + erro.getSQLState());
            System.out.println("erro" + erro.getLocalizedMessage());
        } finally {
            this.getfecharConexao();
        }
        return listProviders;
    }

    public Fornecedores querybyName(String nome) {
        String comandoRecuperar = "call sp_list_providers(" + nome + ")";
        Fornecedores providers = new Fornecedores();
        try {
            this.getConectar();
            this.executarSql(comandoRecuperar);
            while (this.getResultSet().next()) {
                providers.setId(this.getResultSet().getInt(1));
                providers.setCnpj(this.getResultSet().getString(2));
                providers.setName(this.getResultSet().getString(3));
                providers.setEmail(this.getResultSet().getString(4));
                providers.setPhone(this.getResultSet().getString(5));
            }
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro.getMessage());
        } finally {
            this.getfecharConexao();
        }
        return providers;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estoque.dao;

import com.estoque.banco.ConexaoBD;
import com.estoque.model.Employees;
import com.estoque.model.User;

import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.ArrayList;

public class FuncionarioDao extends ConexaoBD {

    public boolean daoSalvarFuncionario(Employees employees, User user) {

        String SalveEmployees = "call sp_save_employees ("
                + "'" + employees.getEmployees_name()+ "',"
                + "'" + employees.getEmployees_function()+ "',"
                + "'" + user.getLogin()+ "',"
                + "'" + user.getPassword()+ "',"
                + "'" + user.getProfile()+ "'"
                + ")";
        try {
            this.getConectar();
            this.executarSql(SalveEmployees);
            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        } finally {
             this.getfecharConexao();
        }

    }

    /**
     * metodo listar funcionarios
     *
     * @return
     */
    /* public ArrayList<ModelFuncionarios> daoGetListarClientes(){
        ArrayList<ModelFuncionarios> listaFuncionario = new ArrayList<>();
        String comandoSql = "call sp_list_funcionarios()";
        try {
            this.getConectar();
            this.executarSql(comandoSql);
            while(this.getResultSet().next()){
                ModelFuncionarios modelFuncionarios = new ModelFuncionarios();
                modelFuncionarios.setCargo(this.getResultSet().getString(1));
                
                ModelContato modelContato = new ModelContato();
                modelContato.setFone(this.getResultSet().getString(2));
                modelContato.setEmail(this.getResultSet().getString(3));
                
                ModelPessoa modelPessoa = new ModelPessoa();
                modelPessoa.setNome(this.getResultSet().getString(4));
                modelPessoa.setDt_nascimento(this.getResultSet().getString(5));
                modelPessoa.setEstado_civil(this.getResultSet().getString(6));
                modelPessoa.setSexo(this.getResultSet().getString(7));
                
                ModelDocumentos modelDocumentos = new ModelDocumentos();
                modelDocumentos.setRg(this.getResultSet().getString(8));
                modelDocumentos.setCpf(this.getResultSet().getString(9));
                
                ModelEndereco modelEndereco = new ModelEndereco();
                
                modelEndereco.setCep(this.getResultSet().getString(10));
                modelEndereco.setLogradouro(this.getResultSet().getString(11));
                modelEndereco.setBairro(this.getResultSet().getString(12));
                modelEndereco.setNumecoCasa(this.getResultSet().getString(13));
                modelEndereco.setNumecoCasa(this.getResultSet().getString(14));
                modelFuncionarios.setModelEndereco(modelEndereco);
               
                listaFuncionario.add(modelFuncionarios);
            }
        }catch(SQLException e){
            System.out.println("Erro: "+e.getMessage());
        }finally{
            this.fecharConexao();
        }
        return listaFuncionario;
    }*/
}

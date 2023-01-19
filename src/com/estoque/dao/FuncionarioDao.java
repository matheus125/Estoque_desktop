package com.estoque.dao;

import com.estoque.banco.ConexaoBD;
import com.estoque.model.Funcionarios;
import com.estoque.model.User;
import java.sql.SQLException;
import java.util.ArrayList;

public class FuncionarioDao extends ConexaoBD {

    public boolean daoFuncionarios(Funcionarios employees, User user) {

        String SalveEmployees = "call sp_salvar_funcionarios ("
                + "'" + employees.getEmployees_name() + "',"
                + "'" + employees.getEmployees_function() + "',"
                + "'" + user.getLogin() + "',"
                + "'" + user.getPassword() + "',"
                + "'" + user.getProfile() + "'"
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
    public ArrayList<User> daoListemployees() {
        ArrayList<User> listEmployees = new ArrayList<>();
        User user = new User();
        Funcionarios employees = new Funcionarios();
        try {
            this.getConectar();
            this.executarSql("call sp_listar_funcionarios");
            while (this.getResultSet().next()) {
                user = new User();
                employees = new Funcionarios();

                employees.setId(this.getResultSet().getInt(1));
                employees.setEmployees_name(this.getResultSet().getString(2));
                employees.setEmployees_function(this.getResultSet().getString(3));

                user.setLogin(this.getResultSet().getString(4));
                user.setPassword(this.getResultSet().getString(5));
                user.setProfile(this.getResultSet().getString(6));

                user.setEmployees(employees);
                listEmployees.add(user);
            }
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            this.getfecharConexao();
        }
        return listEmployees;
    }

    public boolean daoUpdateemployees(Funcionarios employees, User user) {

        String UpdateEmployees = "call sp_update_funcionarios ("
                + "'" + employees.getId() + "',"
                + "'" + employees.getEmployees_name() + "',"
                + "'" + employees.getEmployees_function() + "',"
                + "'" + user.getLogin() + "',"
                + "'" + user.getPassword() + "',"
                + "'" + user.getProfile() + "'"
                + ")";
        try {
            this.getConectar();
            this.executarSql(UpdateEmployees);
            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        } finally {
            this.getfecharConexao();
        }
    }

    public boolean daoDeleteFuncionario(int codigo) {
        String comandoDelete = "call sp_delete_funcionario(" + codigo + ");";
        try {
            this.getConectar();
            this.executarSql(comandoDelete);
            return true;
        } catch (Exception erro) {
            System.out.println("Erro: " + erro.getMessage());
            return false;
        } finally {
            this.getfecharConexao();
        }

    }
}

package com.estoque.dao;

import com.estoque.banco.ConexaoBD;
import com.estoque.model.Client;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClientDao extends ConexaoBD {

    //select * from tb_client where cpf = 03293043216;
    public boolean daoSalvarClient(Client client) {
        String comando = "CALL sp_save_client("
                + "'" + client.getName() + "',"
                + "'" + client.getCpf() + "',"
                + "'" + client.getPhone() + "'"
                + ")";
        try {
            this.getConectar();
            this.executarSql(comando);
            return true;

        } catch (Exception erro) {
            return false;
        }
    }

    public boolean daoUpdateClient(Client client) {
        String comandoUpdate = "CALL sp_update_client("
                + "'" + client.getName() + "',"
                + "'" + client.getCpf() + "',"
                + "'" + client.getPhone() + "'"
                + ")";
        try {
            this.getConectar();
            this.executarSql(comandoUpdate);
            return true;

        } catch (Exception erro) {
            return false;
        }
    }

    public boolean daoDeleteClient(int codigo) {
        String comandoDelete = "call sp_delete_client(" + codigo + ");";
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

    public Client daoGetRecuperarCliente(int codigo) {
        String comandoRecuperar = "call sp_recover_client_id(" + codigo + ");";
        Client client = new Client();
        try {
            this.getConectar();
            this.executarSql(comandoRecuperar);
            while (this.getResultSet().next()) {
                client.setId(this.getResultSet().getInt(1));
                client.setName(this.getResultSet().getString(2));
                client.setCpf(this.getResultSet().getString(3));
                client.setPhone(this.getResultSet().getString(4));
            }
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro.getMessage());
        } finally {
            this.getfecharConexao();
        }
        return client;
    }

    public ArrayList<Client> daoGetListarClientes() {
        ArrayList<Client> listarClientes = new ArrayList<>();
        String comandoSql = "select id, name, cpf, phone from tb_client";
        try {
            this.getConectar();
            this.executarSql(comandoSql);
            while (this.getResultSet().next()) {
                Client client = new Client();
                client.setId(this.getResultSet().getInt(1));
                client.setName(this.getResultSet().getString(2));
                client.setCpf(this.getResultSet().getString(3));
                client.setPhone(this.getResultSet().getString(4));
                listarClientes.add(client);
            }
        } catch (SQLDataException erro) {
            System.out.println("Erro" + erro.getMessage());
            System.out.println("Erro" + erro.getSQLState());
            System.out.println("erro" + erro.getLocalizedMessage());
        } catch (SQLException ex) {
            System.out.println("Erro" + ex.getMessage());
            System.out.println("Erro" + ex.getSQLState());
            System.out.println("erro" + ex.getLocalizedMessage());
        } finally {
            this.getfecharConexao();
        }
        return listarClientes;
    }

    public Client daoGetRecuperarCliente(String cliente) {
        String comandoRecuperar = "call sp_recover_client_name(" + cliente + ")";
        Client client = new Client();
        try {
            this.getConectar();
            this.executarSql(comandoRecuperar);
            while (this.getResultSet().next()) {
                client.setId(this.getResultSet().getInt(1));
                client.setName(this.getResultSet().getString(2));
                client.setCpf(this.getResultSet().getString(3));
                client.setPhone(this.getResultSet().getString(4));
            }
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro.getMessage());
        } finally {
            this.getfecharConexao();
        }
        return client;
    }

    /*  public Client daoGetRecuperarCPf(String cpf) {
        String comandoRecuperar = "call sp_recover_client_cpf(" + cpf + ")";
        Client client = new Client();
        try {
            this.getConectar();
            this.executarSql(comandoRecuperar);
            while (this.getResultSet().next()) {
                client.setId(this.getResultSet().getInt(1));
                client.setName(this.getResultSet().getString(2));
                client.setCpf(this.getResultSet().getString(3));
                client.setPhone(this.getResultSet().getString(4));
            }
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro.getMessage());
        } finally {
            this.getfecharConexao();
        }
        return client;
    }*/
    public Client buscarCpf(String cpf) {
        this.getConectar();
        try {
            String sql = "select * from tb_client where cpf = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cpf);

            ResultSet rs = stmt.executeQuery();
            Client client = new Client();

            if (rs.next()) {
                client.setId(rs.getInt("id"));
                client.setName(rs.getString("name"));
                client.setCpf(rs.getString("cpf"));
                client.setPhone(rs.getString("phone"));
            }

            return client;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não encontrado");
        }
        return null;
    }
}

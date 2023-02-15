package com.estoque.controller;

import com.estoque.model.Cliente;
import com.estoque.dao.ClientDao;
import com.estoque.model.Fone;
import java.util.ArrayList;

public class ControllerClient {

    ClientDao clientDao = new ClientDao();

    public boolean controllerSaveClient(Cliente client, Fone fone) {
        return this.clientDao.daoSalvarClient(client, fone);
    }

    public boolean controllerUpdateClient(Cliente client, Fone fone) {
        return this.clientDao.daoUpdateClient(client, fone);
    }

    public boolean controllerDeletClient(int codigo) {
        return this.clientDao.daoDeleteClient(codigo);
    }

    public Cliente controllerRecuperarClient(int codigo) {
        return this.clientDao.daoGetRecuperarCliente(codigo);
    }

    public ArrayList<Cliente> controlGetListarClientes() {
        return this.clientDao.daoGetListarClientes();
    }

    public Cliente controlRecuperarCliente(String cliente) {
        return this.clientDao.daoGetRecuperarCliente(cliente);
    }

    public Cliente controlBuscarCpf(String cpf) {
        return this.clientDao.buscarCpf(cpf);
    }
    
}

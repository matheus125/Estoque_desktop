package com.estoque.controller;

import com.estoque.model.Client;
import com.estoque.dao.ClientDao;
import java.util.ArrayList;

public class ControllerClient {

    ClientDao clientDao = new ClientDao();

    public boolean controllerSaveClient(Client client) {
        return this.clientDao.daoSalvarClient(client);
    }

    public boolean controllerUpdateClient(Client client) {
        return this.clientDao.daoUpdateClient(client);
    }

    public boolean controllerDeletClient(int codigo) {
        return this.clientDao.daoDeleteClient(codigo);
    }

    public Client controllerRecuperarClient(int codigo) {
        return this.clientDao.daoGetRecuperarCliente(codigo);
    }

    public ArrayList<Client> controlGetListarClientes() {
        return this.clientDao.daoGetListarClientes();
    }

    public Client controlRecuperarCliente(String cliente) {
        return this.clientDao.daoGetRecuperarCliente(cliente);
    }

    public Client controlBuscarCpf(String cpf) {
        return this.clientDao.buscarCpf(cpf);
    }
    
}

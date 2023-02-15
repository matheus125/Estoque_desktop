package com.estoque.model;

public class Cliente {

    private int id;
    private String name;
    private String cpf;
    private Fone fone;

    public Cliente() {
    }

    public Cliente(int id, String name, String cpf, Fone fone) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.fone = fone;
    } 
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    } 

    /**
     * @return the fone
     */
    public Fone getFone() {
        return fone;
    }

    /**
     * @param fone the fone to set
     */
    public void setFone(Fone fone) {
        this.fone = fone;
    }
    


}

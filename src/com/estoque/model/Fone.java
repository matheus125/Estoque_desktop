package com.estoque.model;

public class Fone {

    private int id_fone;
    private String fone;

    public Fone() {
    }

    public Fone(int id_fone, String fone) {
        this.id_fone = id_fone;
        this.fone = fone;
    }

    /**
     * @return the id_fone
     */
    public int getId_fone() {
        return id_fone;
    }

    /**
     * @param id_fone the id_fone to set
     */
    public void setId_fone(int id_fone) {
        this.id_fone = id_fone;
    }

    /**
     * @return the fone
     */
    public String getFone() {
        return fone;
    }

    /**
     * @param fone the fone to set
     */
    public void setFone(String fone) {
        this.fone = fone;
    }

}

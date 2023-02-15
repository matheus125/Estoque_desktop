package com.estoque.model;

public class Email {
    private int id_email;
    private String email;

    /**
     * @return the id_email
     */
    public int getId_email() {
        return id_email;
    }

    public Email() {
    }

    public Email(int id_email, String email) {
        this.id_email = id_email;
        this.email = email;
    }

    /**
     * @param id_email the id_email to set
     */
    public void setId_email(int id_email) {
        this.id_email = id_email;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}

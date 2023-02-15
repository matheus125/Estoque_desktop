package com.estoque.model;

public class Vendas {

    private int id;
    private Cliente client;
    private User user;
    private String sale_date;
    private Double value_total;
    private String type_payment;

    public Vendas() {
    }

    public Vendas(int id, User user, Cliente client, String sale_date, Double value_total, String type_payment) {
        this.id = id;
        this.user = user;
        this.client = client;
        this.sale_date = sale_date;
        this.value_total = value_total;
        this.type_payment = type_payment;
    }

    /**
     * @return the value_total
     */
    public Double getValue_total() {
        return value_total;
    }

    /**
     * @param value_total the value_total to set
     */
    public void setValue_total(Double value_total) {
        this.value_total = value_total;
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
     * @return the sale_date
     */
    public String getSale_date() {
        return sale_date;
    }

    /**
     * @param sale_date the sale_date to set
     */
    public void setSale_date(String sale_date) {
        this.sale_date = sale_date;
    }

    /**
     * @return the type_payment
     */
    public String getType_payment() {
        return type_payment;
    }

    /**
     * @param type_payment the type_payment to set
     */
    public void setType_payment(String type_payment) {
        this.type_payment = type_payment;
    }

    /**
     * @return the client
     */
    public Cliente getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Cliente client) {
        this.client = client;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }
}

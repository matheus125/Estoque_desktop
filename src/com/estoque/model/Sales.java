package com.estoque.model;

public class Sales {

    private int id;
    private User user;
    private String sale_date;
    private Float value;
    private Float value_total;
    private double discount;
    private String type_payment;

    public Sales() {
    }

    public Sales(int id, User user, String sale_date, Float value, Float value_total, double discount, String type_payment) {
        this.id = id;
        this.user = user;
        this.sale_date = sale_date;
        this.value = value;
        this.value_total = value_total;
        this.discount = discount;
        this.type_payment = type_payment;
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
     * @return the value
     */
    public Float getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Float value) {
        this.value = value;
    }

    /**
     * @return the value_total
     */
    public Float getValue_total() {
        return value_total;
    }

    /**
     * @param value_total the value_total to set
     */
    public void setValue_total(Float value_total) {
        this.value_total = value_total;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
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
}

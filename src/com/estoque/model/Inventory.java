package com.estoque.model;

public class Inventory {
    
    private int id;
    private Product product;
    private int qtdproduct;

    public Inventory() {
    }

    public Inventory(int id, Product product, int qtdproduct) {
        this.id = id;
        this.product = product;
        this.qtdproduct = qtdproduct;
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
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return the qtdproduct
     */
    public int getQtdproduct() {
        return qtdproduct;
    }

    /**
     * @param qtdproduct the qtdproduct to set
     */
    public void setQtdproduct(int qtdproduct) {
        this.qtdproduct = qtdproduct;
    }
}

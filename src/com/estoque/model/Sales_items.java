/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estoque.model;

/**
 *
 * @author Matheus
 */
public class Sales_items {

    private Sales sales;
    private Product product;
    private int qtdproduct;
    private Double subtotal;

    public Sales_items() {
    }

    public Sales_items(Sales sales, Product product, int qtdproduct, Double subtotal) {
        this.sales = sales;
        this.product = product;
        this.qtdproduct = qtdproduct;
        this.subtotal = subtotal;
    }

    /**
     * @return the sales
     */
    public Sales getSales() {
        return sales;
    }

    /**
     * @param sales the sales to set
     */
    public void setSales(Sales sales) {
        this.sales = sales;
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

    /**
     * @return the subtotal
     */
    public Double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
}

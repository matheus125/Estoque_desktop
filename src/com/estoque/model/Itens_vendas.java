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
public class Itens_vendas {

    private Vendas sales;
    private Produto product;
    private int qtdproduct;
    private Double subtotal;

    public Itens_vendas() {
    }

    public Itens_vendas(Vendas sales, Produto product, int qtdproduct, Double subtotal) {
        this.sales = sales;
        this.product = product;
        this.qtdproduct = qtdproduct;
        this.subtotal = subtotal;
    }

    /**
     * @return the sales
     */
    public Vendas getSales() {
        return sales;
    }

    /**
     * @param sales the sales to set
     */
    public void setSales(Vendas sales) {
        this.sales = sales;
    }

    /**
     * @return the product
     */
    public Produto getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Produto product) {
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

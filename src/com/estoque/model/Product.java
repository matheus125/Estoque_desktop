package com.estoque.model;

public class Product {

    private int id;
    private String category;
    private String type;
    private String brand;
    private String size;
    private String description;
    private String bar_code;
    private Float price;
    private int qtd; 
    private Providers providers;

    public Product() {
    }

    public Product(int id, String category, String type, String brand, String size, String description, String bar_code, Float price, int qtd, Providers providers) {
        this.id = id;
        this.category = category;
        this.type = type;
        this.brand = brand;
        this.size = size;
        this.description = description;
        this.bar_code = bar_code;
        this.price = price;
        this.qtd = qtd;
        this.providers = providers;
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
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the bar_code
     */
    public String getBar_code() {
        return bar_code;
    }

    /**
     * @param bar_code the bar_code to set
     */
    public void setBar_code(String bar_code) {
        this.bar_code = bar_code;
    }

    /**
     * @return the price
     */
    public Float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * @return the providers
     */
    public Providers getProviders() {
        return providers;
    }

    /**
     * @param providers the providers to set
     */
    public void setProviders(Providers providers) {
        this.providers = providers;
    }

    /**
     * @return the qtd
     */
    public int getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}

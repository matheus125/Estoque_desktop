package com.estoque.model;

public class Category {
    
    private int id;
    private String category_name;  

    public Category() {
    }

    public Category(int id, String category_name) {
        this.id = id;
        this.category_name = category_name;
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
     * @return the category_name
     */
    public String getCategory_name() {
        return category_name;
    }

    /**
     * @param category_name the category_name to set
     */
    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
}

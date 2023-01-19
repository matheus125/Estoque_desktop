package com.estoque.model;

public class Funcionarios {
    
    private int id;
    private String employees_name;
    private String employees_function;

    public Funcionarios() {
    }

    public Funcionarios(int id, String employees_name, String employees_function) {
        this.id = id;
        this.employees_name = employees_name;
        this.employees_function = employees_function;
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
     * @return the employees_name
     */
    public String getEmployees_name() {
        return employees_name;
    }

    /**
     * @param employees_name the employees_name to set
     */
    public void setEmployees_name(String employees_name) {
        this.employees_name = employees_name;
    }

    /**
     * @return the employees_function
     */
    public String getEmployees_function() {
        return employees_function;
    }

    /**
     * @param employees_function the employees_function to set
     */
    public void setEmployees_function(String employees_function) {
        this.employees_function = employees_function;
    }
    
    
}

package com.estoque.model;

public class User {
    private int id;
    private Funcionarios employees;
    private String login;
    private String password;
    private String profile;

    public User() {
    }

    public User(int id, Funcionarios employees, String login, String password, String profile) {
        this.id = id;
        this.employees = employees;
        this.login = login;
        this.password = password;
        this.profile = profile;
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
     * @return the employees
     */
    public Funcionarios getEmployees() {
        return employees;
    }

    /**
     * @param employees the employees to set
     */
    public void setEmployees(Funcionarios employees) {
        this.employees = employees;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the profile
     */
    public String getProfile() {
        return profile;
    }

    /**
     * @param profile the profile to set
     */
    public void setProfile(String profile) {
        this.profile = profile;
    }
}

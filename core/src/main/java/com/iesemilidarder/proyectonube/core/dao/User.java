package com.iesemilidarder.proyectonube.core.dao;

import com.iesemilidarder.proyectonube.core.base.DBObject;

/**
 * dummies
 * com.iesemilidarder.fordummies.web
 * Created by alber in 15/12/2017.
 * Description:
 */
public class User extends DBObject {
    private int id;
    private String username;
    private String email;
    private String password;

    public int getId() {
        return id;
    }

    /**
     * sets the id, owasp
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    /**
     * sets the username, owaaaaaasp
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    /**
     * sets the email, owaaaaaasp
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    /**
     * sets the password, owaaaaaasp
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    protected void beforeSave() {
        doLog(String.format("Saving %s", this.getClass().getCanonicalName()));
        System.out.println("Saving users");
    }
}


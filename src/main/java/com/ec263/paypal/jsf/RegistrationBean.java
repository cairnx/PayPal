/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec263.paypal.jsf;

import com.ec263.paypal.ejb.UserService;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.*;
import javax.inject.Inject;

/**
 *
 * @author Euan
 */
@Named
@RequestScoped
public class RegistrationBean {
    
    @EJB
    UserService usrSrv;
    
    String username;
    String userpassword;
    String name;
    String surname;

    /**
     * Creates a new instance of RegistrationBean
     */
    public RegistrationBean() {
    }
    
    //call the injected EJB
    public String register() {
        usrSrv.registerUser(username, userpassword, name, surname);
        return "index";
    }

    public UserService getUsrSrv() {
        return usrSrv;
    }

    public void setUsrSrv(UserService usrSrv) {
        this.usrSrv = usrSrv;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

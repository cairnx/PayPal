/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec263.paypal.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Euan
 */
@Entity
public class SystemUser implements Serializable{
    
    
    @NotNull
    String username;
    @NotNull
    String paswdToStoreInDB;
    String name;
    String surname;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    public SystemUser() {
    }

    public SystemUser(String username, String paswdToStoreInDB, String name, String surname) {
        this.username = username;
        this.paswdToStoreInDB = paswdToStoreInDB;
        this.name = name;
        this.surname = surname;
    }

//    public SystemUser(String username, String paswdToStoreInDB, String name, String surname) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPaswdToStoreInDB() {
        return paswdToStoreInDB;
    }

    public void setPaswdToStoreInDB(String paswdToStoreInDB) {
        this.paswdToStoreInDB = paswdToStoreInDB;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

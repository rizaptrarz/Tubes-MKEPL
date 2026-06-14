/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesmkepl;

/**
 *
 * @author LENOVO
 */
public class user {
    private String user_name;
    private String id_user;
    private String pass;
    private String email;
    private String alamat_user;

    public user(String user_name, String id_user, String pass, String email, String alamat_user) {
        this.user_name = user_name;
        this.id_user = id_user;
        this.pass = pass;
        this.email = email;
        this.alamat_user = alamat_user;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getId_user() {
        return id_user;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }

    public String getAlamat_user() {
        return alamat_user;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAlamat_user(String alamat_user) {
        this.alamat_user = alamat_user;
    }

    public void printUserInfo() {
        System.out.println("User Information:");
        System.out.println("Username: " + user_name);
        System.out.println("ID User: " + id_user);
        System.out.println("Email: " + email);
        System.out.println("Alamat: " + alamat_user);
    }
}

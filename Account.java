/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalhazirlik;

/**
 *
 * @author YUSUF
 */
public abstract class Account {
    private String username;
    private int balance;
    
    Account(String username, int balance) {
        this.username = username;
        this.balance = balance;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String name) {
        this.username = name;
    }
    
    public int getBalance() {
        return this.balance;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    
    public abstract void showType(); 
    
    
    
    
}

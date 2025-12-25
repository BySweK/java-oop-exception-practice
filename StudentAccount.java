/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalhazirlik;

/**
 *
 * @author YUSUF
 */
public class StudentAccount extends Account implements Loginable {
    StudentAccount(String username, int balance) {
        super(username, balance);
    }

    @Override
    public void showType() {
        System.out.println("Student Account");
    }

    @Override
    public boolean login(String password) {
        
        if(!password.equals("1234")) {
            throw new LoginException("Wrong Password !");
        } 
        System.out.println("Giris Basarili.");
        return true;
    }
}

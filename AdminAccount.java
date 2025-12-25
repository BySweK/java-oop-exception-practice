/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalhazirlik;

/**
 *
 * @author YUSUF
 */
public class AdminAccount extends Account implements Loginable {
    AdminAccount(String username, int balance) {
        super(username,balance);
    }

    @Override
    public void showType() {
        System.out.println("Admin Account");
    }

    @Override
    public boolean login(String password) {
       if(!password.equals("admin")) {
           throw new LoginException("Wrong Password ! ");
       }
       System.out.println("Giris Basarili.");
       return true;
    }
}

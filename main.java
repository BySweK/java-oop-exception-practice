/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finalhazirlik;

import java.util.Scanner;

/**
 *
 * @author YUSUF
 */




public class main {
    

    public static void withdraw(Account acc, int amount) throws BalanceException {
        
        if(amount > acc.getBalance()) {
            throw new BalanceException("Wrong Amount !");
        } else {
            System.out.println("Balance kontrolu gecildi.");
            acc.setBalance(acc.getBalance() - amount);
        }
        
    }
    public static void main(String[] args) {
     // 19.45 - 
     
     Account a1 = new StudentAccount("ali",500);
     Account a2 = new AdminAccount("root",1000);
     
     Loginable l1 = (Loginable) a1;
     Loginable l2 = (Loginable) a2;
     
     l1.login("1234");
     l2.login("admin");
     
     
     try {
         withdraw(a1,200);
     }catch(BalanceException e) {
         System.out.println(e.getMessage());
     }
     
     System.out.println("a1 hesabının yeni bakiyesi : " + a1.getBalance());
    
     
     
    
}
    
}
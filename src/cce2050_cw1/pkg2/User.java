/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cce2050_cw1.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Lenovo-PC
 */
public class User {
    
 private String name;
 private String surname;
 private BankAccount bankAccount;
 private ArrayList<Double> transactionlist;
 
 public User(String n, String s, BankAccount bA, ArrayList<Double> tl)                                                       
    {
        this.name = n;
        this.surname = s;
        this.bankAccount = bA;
        this.transactionlist=tl;
    }

    User(String saul, String goodman, Object bankAccount, double[] SaulList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getUserName(){
        return this.name+" "+this.surname;
    }
 

 
 
 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cce2050_cw1.pkg2;

/**
 *
 * @author Lenovo-PC
 */
class bankAccount {
    private long accountNo;                                                                     
    private double accountBalance;
    private User user;
    public bankAccount(long accountNo, double accountBalance)                                       
    {
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;  
    }
    public long getAccountNo()
    {
        return this.accountNo;
    }
    public double getAccountBalance()
    {
        return this.accountBalance;
    }   
    public synchronized void deposit(double value,String name)                                               
    {
        System.out.println("The user-"+name+" deposits an amount of "+value);
        accountBalance+=value;
    }
    public synchronized void withdraw(double value,String name)
    {
        System.out.println("The user-"+name+" withdraws an amount of "+Math.abs(value));
        accountBalance-=value;
        
        
    }
}
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cce2050_cw1.pkg2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;



/**
 *
 * @author Ryan
 */
public class CCE2050_cw12 {

     Scanner input = new Scanner (System.in);
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       ArrayList<User> user = new ArrayList<>();  
       Scanner input = new Scanner (System.in);
       
       System.out.println("Welcome to CCE2050 Bank");
       System.out.println("1) Create the bank account \n");
       System.out.println("2) Create User \n");
       System.out.println("3) Run Simulation \n");
       System.out.println("4) Exit \n");
        
       
       
       double accBalance = 1980;
       long accountno = 987654321; 
       
       
       while (true) {
           System.out.println("Please select your option");
           int choice = input.nextInt();
      
           if (choice == 1) {
           System.out.println("Create the bank account option has been selected");
           accountno = 987654321 ; 
           System.out.println("You're bank acc number has been assigned " + accountno  +  "\n");
           System.out.println("What ammount would you like to deposit?\n");
           accBalance = input.nextDouble();
           
               bankAccount bankAccount = new bankAccount( accountno, accBalance );
               System.out.println("Bank Account is successfully created: " +  accountno  + " and your Account Balance is: " + accBalance);
        
           }
           if (choice == 2) {
               Object bankAccount = null;
           if (bankAccount == null) {
           } else {
            double[] SaulList;
            SaulList = new double[] {50.0, 10.0,-20.0, 10.0, -20.0, 20.0, 10.0, 50.0, -10.0, 10.0, -10.0, 50.0};
            double[] WalterList;
            WalterList = new double[] {20.0, 20.0, -20.0, 50.0, -20.0, 10.0, 50.0, 50.0, -20.0, 10.0, 10.0};
            double[] PinkList;
            PinkList = new double[] {50.0, 10.0, 10.0, -10.0, -10.0, 50.0, 20.0, -10.0, -20.0};
            double[] HankList;
            HankList = new double[] {50.0, 10.0, -20.0, 20.0, 10.0, -20.0};
            
       user.add(new User("Saul", "Goodman", bankAccount, SaulList));                                            
       user.add(new User("Walter", "White", bankAccount, WalterList));
       user.add(new User("Jessie", "Pinkman", bankAccount, PinkList));
       user.add(new User("Hank", "Schradar", bankAccount, HankList));
           }        
           
            
               
               
           System.out.println("You have selected the Create User option.");   
           System.out.println("User Saul Goodman created\n");
           System.out.println("User Walter White created\n");
           System.out.println("User Jessie Pinkman created\n");
           System.out.println("User Hank Schrader created\n");
           
           }
           if (choice == 3) {
               
              if(user.isEmpty()){

                    System.out.println("Create users first to go ahead with the simulation");

                }

                else{
                  Object bankAccount = null;

                if (bankAccount == null) {

                    System.out.println("Please create a bank account with an account balance and account number to continue");

                } else {
                      int i = 0;

                    for (int j = 0; j < i; j++) {

                        user.get(j).start();  
                
           }
           if (choice == 4) {

           System.exit(0);                                                                                                              //exit the machine
                                            
           }
       }
           
           
           
           
           
           
           
           
           
           
       
      
        
        
        
        
        
        
        
    }
    
           }
       }
    }
}

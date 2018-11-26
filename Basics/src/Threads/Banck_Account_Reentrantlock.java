/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import javax.swing.JOptionPane;

/**
 *
 * @author rm
 */
public class Banck_Account_Reentrantlock {
    
    private String account_number;
    private double account_balance=0;
    
    public Banck_Account_Reentrantlock(String account,double balance){
    
       this. account_number=account;
       this. account_balance=balance;
    }
    
  
    public synchronized void withdraw (double ammount)throws InterruptedException{
    
        
       // Thread.sleep(4000);
        
    try{
        if(ammount>account_balance)
        
        throw new RuntimeException();
        

       }catch(RuntimeException re){
        
        JOptionPane.showMessageDialog(null, "Sorry .... balance not enough");
        
        
        System.exit(0);
        
        }
    
    
    
    account_balance-=ammount;
    
   
    
    System.out.println("-------------   Report   ----------");
    
     System.out.println(Thread.currentThread().getName());
    
    System.out.println("account_balance is "+account_number);
    
    System.out.println("ACcount balance is "+account_balance);
    
    
    System.out.println("ammount is "+ ammount);
    
    
    }
        
        
    
    
    
    
    }
    

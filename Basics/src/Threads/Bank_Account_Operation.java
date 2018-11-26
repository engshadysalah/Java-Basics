/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rm
 */
public class Bank_Account_Operation implements Runnable{
    
    
    Banck_Account_Reentrantlock bank=new Banck_Account_Reentrantlock("Abc010201243", 160000);
    
    Random ra=new Random(10);
    
    
    public static void main (String[]args){
    
    
        Bank_Account_Operation obj=new Bank_Account_Operation();
        
        Thread shady=new Thread(obj);
        
        Thread salah=new Thread(obj);
        
        Thread pop=new Thread(obj);
    
        shady.currentThread().setName("shady");
        salah.currentThread().setName("salah");
        pop.currentThread().setName("pop");
    
        
        shady.setPriority(Thread.MAX_PRIORITY);
        
        
        shady.start();
        salah.start();
        pop.start();
    
    
    }

    @Override
    public void run() {
        
        
        for(int count=0;count<100;count++){
            try {
                
                bank.withdraw(ra.nextFloat() * 10000);
            
            } catch (InterruptedException ex) {
               
            }
            
            
        }
        
        
    }
    
    
}

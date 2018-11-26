/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author rm
 */
public class Test_MY_Word_Runnabl {
  
    
    public static void main(String[] args) {
     
       /* 
        MY_Word_Thread_Runabl obj=new MY_Word_Thread_Runabl();
        
        Thread obj1 = new Thread(obj);
        Thread obj2 = new Thread(obj);
        Thread obj3 = new Thread(obj);
        Thread obj4 = new Thread(obj);
     */
         
        //class is an object
         Thread obj11 = new Thread(new MY_Word_Thread_Runabl(1) );
         Thread obj22 = new Thread(new MY_Word_Thread_Runabl(2) );
         Thread obj33 = new Thread(new MY_Word_Thread_Runabl(3) );
         Thread obj44 = new Thread(new MY_Word_Thread_Runabl(4) );
         
     
        obj11.start();
        obj22.start();
        obj33.start();
        obj44.start();
       
        
     
     }
}

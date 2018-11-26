/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author rm
 */



public class Test_MY_Word_Thread {
    
      public static void main(String[] args) {
     
          
          My_Word_Thread obj1=new My_Word_Thread(1);
          My_Word_Thread obj2=new My_Word_Thread(2);
          My_Word_Thread obj3=new My_Word_Thread(3);
          My_Word_Thread obj4=new My_Word_Thread(4);
          
          
        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();
       
        
     
     }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author rm
 */
public class Main_Thread_Class_num5 {
   
    public static void main (String[]args){
    
    
    Thread.currentThread().setName("POP Shady");
    
    String name= Thread.currentThread().getName();
    System.out.println(name);
    
    
    //Synchronized : to control to access to share resources like 2  read and write from file in the same time
    //Synchronized made block(lock) to the code 
    // then use : critical section  one one cane read and write file (one after one)
   
    
    
    //Volatile: ex: private vloatile bolean x;
    
    // make : تخلي لكل ثريد متغير خاص بيه 
    }
}

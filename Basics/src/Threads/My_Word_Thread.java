/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author rm
 */

//frist way  : extends Thread
public class My_Word_Thread extends Thread{
    
    
    private int Docu = 0;
    
   



     
     
    @Override
     public void run(){
     
     Write();
     System.out.println(Thread.currentThread().getName());
     }

    
    public My_Word_Thread(int documeent) {

        Docu = documeent;

    }

    public void Write() {

        for (int row = 0; row < 100; row++) {

            System.out.println(Docu+ " - Curent Row  " + row);

        }




    }

}

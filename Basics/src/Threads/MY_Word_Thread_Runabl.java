/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author rm
 */

// the second way : implements Runnable

public class MY_Word_Thread_Runabl implements Runnable{

    private int Docu = 0;
    
    
    @Override
    public void run() {
        Write();
       
    }
    
    public MY_Word_Thread_Runabl(int documeent) {

       Docu = documeent;

    }

    public void Write() {

        for (int row = 0; row < 100; row++) {

            System.out.println(Docu+ " - Curent Row  " + row);

        }




    }

}



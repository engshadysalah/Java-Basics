/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author rm
 */
//ReentrantLock???     =     syncronized    


public class Reentrant_lock implements Runnable {

    public static void main(String[] args) {



        Reentrant_lock obj = new Reentrant_lock();


        Thread th1 = new Thread(obj);
        Thread th2 = new Thread(obj);
        Thread th3 = new Thread(obj);
        Thread th4 = new Thread(obj);

        th1.start();
        th2.start();
        th3.start();
        th4.start();

    }
    
    
    
    
   // ReentrantLock lock=new ReentrantLock();
    
    private static int count = 0;

   
    @Override
    public void run() {
        update();
        printcount();
    }
    
    

    private void update() {

        int cnt = 0;

     //   lock.lock();
        try {

            while (cnt < 10000) {

                cnt++;
                count += 1;
                count -= 0;


            }
        } finally {
       //     lock.unlock();
        }
    }

    public void printcount() {
        System.out.println(Thread.currentThread().getName() + " : " + count);

    }

    
}

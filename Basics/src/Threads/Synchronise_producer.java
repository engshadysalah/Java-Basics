/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author rm
 */
public class Synchronise_producer implements Runnable {

    public static void main(String[] args) {

        Synchronise_producer obj = new Synchronise_producer();

        Thread th1 = new Thread(obj);
        th1.start();

        Thread th2 = new Thread(obj);
        th2.start();

        Thread th3 = new Thread(obj);
        th3.start();

        Thread th4 = new Thread(obj);
        th4.start();

        System.out.println(Synchronise_producer.count);

    }

    public static int count = 0;

    Object sh = new Object();

    private void increment() {

        count += 100;

    }

    private void decremnt() {

        count -= 100;
    }

    //1:synchronized on all the method
    //private synchronized void  update(){
    private synchronized void update() {

        //i sure count is = zero after this method
        System.out.println(Thread.currentThread().getName());

        //2:synchronized on part of code
        //Critical section
        synchronized (sh) {
            increment();
            decremnt();
        }

    }

    @Override
    public void run() {

        for (int x = 0; x < 100000; x++) {
            update();
        }
    }

}

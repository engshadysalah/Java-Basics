/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author rm
 */
public class ExcuterConsume implements Runnable {

    public static void main(String[] args) {

        ExecutorService executer = Executors.newFixedThreadPool(2);

        for (int id = 0; id < 10; id++) {

            executer.submit(new ExcuterConsume(id)); //constractor
        }

        executer.isShutdown();

        System.out.println("all task ssubmited");

        try {
            executer.awaitTermination(5, TimeUnit.MINUTES);

        } catch (InterruptedException ex) {
        }

        System.out.println("==========================");
        System.out.println("all task complited");
        System.out.println("==========================");

    }

    private int id;

    public ExcuterConsume(int d) {

        this.id = d;

    }

    @Override
    public void run() {
        System.out.println("task started for theard" + id);

        try {

            Thread.currentThread().sleep(5000);

        } catch (InterruptedException ex) {
        }

        System.out.println("task completed for theard" + id);

    }

}

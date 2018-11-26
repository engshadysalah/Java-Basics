/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.Scanner;

/**
 *
 * @author rm
 */
public class Sleep_Class_Vedio5 extends Thread {

    public static void main(String[] args) {

        Sleep_Class_Vedio5 obj = new Sleep_Class_Vedio5();

        System.out.println("enter 1 to start or 0 to stop");

        obj.start();

        obj.setstatus(new Scanner(System.in).nextInt());

    }

    private boolean starting = true;
    private volatile int status = 1;

    private void startup() {

        starting = true;
    }

    private void shutdown() {

        starting = false;

    }

    private void changestatus() {

        if (getstatus() == 0) {

            shutdown();
            exit();
        } else {
            startup();
        }

    }

    private void setstatus(int status) {
        this.status = status;

    }

    private int getstatus() {

        return status;
    }

    private void process() {

        while (starting) {

            System.out.println("system is running now");
            changestatus();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }

    }

    private void exit() {

        for (int index = 0; index < 30; index++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }

            System.out.print(" . ");

            System.out.print("");

            System.out.print(" system shutdown completed ");

            System.out.print("------------------------------------------");

        }

    }

    @Override
    public void run() {

        process();

    }

}

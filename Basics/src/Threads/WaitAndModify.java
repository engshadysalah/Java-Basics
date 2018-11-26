/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rm
 */
public class WaitAndModify {

    public static void main(String[] args) {

        final WaitAndModify obje = new WaitAndModify();

        Thread player_1 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    obje.player1();
                } catch (InterruptedException ex) {

                }
            }
        });

        Thread player_2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    obje.player2();
                } catch (InterruptedException ex) {
                    Logger.getLogger(WaitAndModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        player_1.start();
        player_2.start();

    }

    Object obj = new Object();

    public void player1() throws InterruptedException {

        synchronized (obj/*this*/) {

            System.out.println("player1 shotting football now");

            obj.wait();  //xxxxxxxxxxxx
            //go to synchronized(obj){ ..............
            System.out.println("than u for play back again ");
        }
    }

    public void player2() throws InterruptedException {

        synchronized (obj /*this*/) {

            Thread.sleep(1000);

            Scanner sc = new Scanner(System.in);

            System.out.println("press enter the shot ");
            sc.nextLine();

            obj.notifyAll();//{تشغل كل الثريدات اللي بتريفرانس نفس الاوبجكت}
            // obj.notify();  {تشغل اخر واوبجكت نداها وهو اللي فيxxxxxxxxxxxxه }
            Thread.sleep(1000);
        }

    }

}

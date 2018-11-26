/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author rm
 */
public class Announimous_Class {

    Announimous_Class() {

        super();
    }

    public static void main(String[] args) {



        // the third way : using Announimous class (onlin class without name)
        Thread th = new Thread(new Runnable() {

            @Override
            public void run() {

                Write();
            }

            public void Write() {

                for (int row = 0; row < 100; row++) {

                    System.out.println(" - Curent Row  " + row);

                }




            }
        });

        th.start();





        // the 4 way : using Announimous class (onlin class without name)


        new Thread(new Runnable() {

              @Override
            public void run() {

                Write();
            }

            public void Write() {

                for (int row = 0; row < 100; row++) {

                    System.out.println(" - Curent Row  " + row);

                }



            }
        }).start();




    }
}

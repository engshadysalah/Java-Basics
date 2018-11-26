/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LooP;

/**
 *
 * @author rm
 */
public class program4 {

    public static void main(String[] args) {

        for (int row = 0; row < 15; row++) {

            //     if( ((row%2)==0) && ((row%2) <8)){System.out.print(" ");}
            for (int col = 0; col < 20; col++) {

                if (col < 6 && row < 8) {
                    System.out.print("*");
                } else {
                    System.out.print("=");
                }
                // if(){System.out.println(" ");}

                if (row > 8) {

                    System.out.print("=");
                }

            }
            System.out.println("");

        }
    }
}

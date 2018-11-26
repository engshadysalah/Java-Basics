/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LooP;

/**
 *
 * @author rm
 */
public class program6 {

    public static void main(String[] args) {

        for (int ro = 1; ro <= 12; ro++) {

            System.out.print(" " + ro + " ");

        }
        System.out.println(" ");

        for (int co = 1; co <= 12; co++) {

            System.out.print(" " + co + " ");

        }
        System.out.println(" ");

        int resu = 1;
        for (int row = 2; row <= 12; row++) {

            for (int coul = 1; coul <= 12; coul++) {

                resu = row * coul;

                System.out.print(" " + resu + " ");

            }
            System.out.println(" ");

        }
    }

}

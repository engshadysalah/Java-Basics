/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LooP;

/**
 *
 * @author rm
 */
public class program5 {

    public static void main(String[] args) {

        int x = 0;

        while (x <= 10) {

            x++;
            if (x == 5) {
                continue;
                //go to start
            }

            System.out.print(x);

        }
        System.out.println(" \n");

        ////////////////////////////////////////////////////////////
        int y = 0;

        while (y <= 10) {

            y++;
            if (y == 5) {
                break;
                 //go to end
            }

            System.out.print(y);

        }

    }
}

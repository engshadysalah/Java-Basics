/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY;

/**
 *
 * @author rm
 */
public class program3 {

    public static void main(String[] args) {

        int shady[][] = {{100, 50}, {60, 7565647}, {1, 3}};

        int salah[][] = {{30, 2000}, {342, 70}};

        int said[][] = {{2000, 5400}, {60, 536}};

        System.out.println(shady.length);
        System.out.println(shady.length);
        System.out.println(salah.length);
        System.out.println(salah.length);

        print(shady);

    }

    public static void print(int arr[][]) {

        for (int row = 0; row < arr.length; row++) {
            for (int colu = 0; colu < 2; colu++) {

                System.out.print(arr[row][colu] + "\t");
            }
            System.out.print("\n");

        }

    }
}

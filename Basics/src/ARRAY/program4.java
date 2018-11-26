/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY;

import javax.swing.JOptionPane;

/**
 *
 * @author rm
 */
public class program4 {

    public static void main(String[] args) {

        String s1 = JOptionPane.showInputDialog(null, "enter num of row");
        int row = Integer.parseInt(s1);

        String s2 = JOptionPane.showInputDialog(null, "enter num of colum");
        int colu = Integer.parseInt(s2);

        int arrr[][] = new int[row][colu];

        System.out.println(arrr.length);
        
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < colu; y++) {

                String in1 = JOptionPane.showInputDialog(null, "enter data");
                int in2 = Integer.parseInt(in1);

                arrr[x][y] = in2;

            }
        }

        program4 p = new program4();

        p.print(arrr);

    }

    public void print(int arr[][]) {

        for (int row = 0; row < arr.length; row++) {
            for (int colu = 0; colu < arr.length; colu++) {

                System.out.print(arr[row][colu] + "\t");
            }

        }

    }
}

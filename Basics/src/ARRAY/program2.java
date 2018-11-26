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
public class program2 {

    public static void main(String[] args) {

        String s1 = JOptionPane.showInputDialog(null, "enter num of row");
        int row = Integer.parseInt(s1);

        String s2 = JOptionPane.showInputDialog(null, "enter num of colum");
        int colu = Integer.parseInt(s2);

        String tabl[][] = new String[row][colu];

        for (int x = 0; x < tabl.length; x++) {
            for (int y = 0; y < colu; y++) {

                String in1 = JOptionPane.showInputDialog(null, "enter data");
                // int in2=Integer.parseInt(in1);

                tabl[x][y] = in1;
            }

        }

        System.out.println("Name\tCountry");
        System.out.println("=================");

        for (int xx = 0; xx < tabl.length; xx++) {
            for (int yy = 0; yy < colu; yy++) {

                System.out.print(tabl[xx][yy] + "\t");

            }
            System.out.println("");
        }

    }
}

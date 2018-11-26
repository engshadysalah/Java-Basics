package ARRAY;

import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rm
 */
public class NewClass {

    public static void main(String[] args) {

        int degree[] = new int[5];

        for (int i = 0; i < degree.length; i++) {

            String s = JOptionPane.showInputDialog(null, "Enter Degree" + (i + 1));

            int n = Integer.parseInt(s);

            degree[i] = n;

        }

        for (int degre : degree) {
            System.out.print(degre);

        }

        //PAge 160 Book
//   Arrays.sort();
//   Arrays.binarySearch(, );
//   Arrays.equals(, );
//   Arrays.fill(, );
// Example : get Revarse Array
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LooP;

import javax.swing.JOptionPane;

/**
 *
 * @author rm
 */
public class program2 {

    public static void main(String[] args) {

        String s1 = JOptionPane.showInputDialog(null, "enter num");

        if (s1.matches("[\\d]*")) {  //any num
            //  if(s1.matches("[\\d]")){ || if(s1.matches("[\\d*]")){  only one num
            // if(s1.matches("[\\d]{3}")){  only 3 num

            int fact = Integer.parseInt(s1);

            double resul = 1;

            for (int x = 1; x <= fact; x++) {

                resul = resul * x;

            }
            JOptionPane.showMessageDialog(null, resul);
        } else {
            JOptionPane.showMessageDialog(null, " Error");
        }

    }
}

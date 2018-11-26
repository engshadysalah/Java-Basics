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
public class program1 {

    public static void main(String[] args) {

        int i = 0;
        while (i == 0) {

            String s1 = JOptionPane.showInputDialog(null, "enter assas");
            int assaa = Integer.parseInt(s1);

            String s2 = JOptionPane.showInputDialog(null, "enter assas");
            int oass = Integer.parseInt(s2);

            int x = 1;
            int res = 1;
            while (x <= oass) {

                res = res * assaa;
                x++;

            }

            JOptionPane.showMessageDialog(null, res);

            i = JOptionPane.showConfirmDialog(null,  "to complete press yes", "Attention", 1);

            System.out.println("jop\t"+i);
        }
    }
}

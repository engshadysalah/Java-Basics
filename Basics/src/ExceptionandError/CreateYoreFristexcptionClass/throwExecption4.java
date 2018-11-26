/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionandError.CreateYoreFristexcptionClass;

import ExceptionandError.*;
import javax.swing.JOptionPane;

/**
 *
 * @author rm
 */
public class throwExecption4 {

    //meaning: ازاي الامي خطأ في  طريق اليوسر زي ما ارمي ادامه موزة ازحلقه
    //meaning:وبتوقف تنفسذ الكود 
    //i cannot understaned it good
    public static void main(String[] args) throws subMyException {

        String s1 = JOptionPane.showInputDialog(null, "frist num");
        int num1 = Integer.parseInt(s1);

        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "secound num"));

        if (isEqual(num1, num2) == true) {

            JOptionPane.showMessageDialog(null, "succful");

        }
    }

    private static boolean isEqual(int n1, int n2) {

        boolean po = true;

        try {

            if (n1 > n2) {

                po = false;
                throw new subMyException("num1 is greater than mu2");
            } else if (n2 > n1) {

                po = false;
                throw new subMyException("num2 is greater than mu1");
            }

        } catch (Exception exp) {

            JOptionPane.showMessageDialog(null, exp.getMessage());

        } finally {

            return po;
        }

    }

}

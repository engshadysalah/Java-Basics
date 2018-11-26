/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionandError;

import javax.swing.JOptionPane;

/**
 *
 * @author rm
 */
public class ExecptionTrap1 {

    public static void main(String[] args) {

        try {
            String s1 = JOptionPane.showInputDialog(null, "frist num");
            int num1 = Integer.parseInt(s1);

            int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "secound num"));

            double result = num1 / num2;

               System.out.println("No Exception");
            
            JOptionPane.showMessageDialog(null, result);

        } //the Frist typ of execption : divided by zero (the error is called "ArithmeticException")
        catch (ArithmeticException exp1) {

            JOptionPane.showMessageDialog(null, exp1.getMessage() + " :   u are divided by zero ");

        } //the Second typ of execption : inter string insted of numbersineger (the error is called "NumberFormatException")
        catch (NumberFormatException exp2) {

            JOptionPane.showMessageDialog(null, " u enter string pleas try number ...." + exp2.getMessage());

            exp2.printStackTrace();
        }
        
        System.out.println("hiiiiiiiiiiiiiiiiii^");

    }
}

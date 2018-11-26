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
public class ExecprionTarp2 {

    public static void main(String[] args) {

        try {

            String frindes[] = {"shady", "salah", "mabrook", "said"};

            int index = Integer.parseInt(JOptionPane.showInputDialog(null, "enter frind number"));

            JOptionPane.showMessageDialog(null, frindes[index]);

        } //the Second typ of execption : inter string like(enter thatequals "") insted of numbersineger (the error is called "NumberFormatException")
        catch (NumberFormatException exp) {

            JOptionPane.showMessageDialog(null, " u enter rong number pleas try again " + exp.getMessage());

        } //the thrid typ of execption : inter index not between uper and lower index (the error is called "ArrayIndexOutOfBoundsException")
        catch (ArrayIndexOutOfBoundsException exp) {

            JOptionPane.showMessageDialog(null, " frinde num not found please try again " + exp.getMessage());

        }

    }
}

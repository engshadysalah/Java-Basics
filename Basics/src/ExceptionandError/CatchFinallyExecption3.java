/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionandError;

import javax.sound.midi.ShortMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author rm
 */
public class CatchFinallyExecption3 {

    public static void main(String[] args) {

       
        try {

            String frindes[] = {"shady", "salah", "mabrook", "said"};

            int index = Integer.parseInt(JOptionPane.showInputDialog(null, "enter frind number"));

            JOptionPane.showMessageDialog(null, frindes[index]);

        } //the Second typ of execption : inter string like(enter thatequals "") insted of numbersineger (the error is called "NumberFormatException")
        catch (NumberFormatException exp) {

            JOptionPane.showMessageDialog(null, " u enter String pleas Enter number ! " + exp.getMessage());

        } //the thrid typ of execption : inter index not between uper and lower index (the error is called "ArrayIndexOutOfBoundsException")
        catch (ArrayIndexOutOfBoundsException exp) {

            JOptionPane.showMessageDialog(null, " frinde num not found please try again " + exp.getMessage());

        } //the Forth typ of execption : is public execption to catch any execption(error) not be treated(معالج)  but it must be is the last catch
        catch (Exception exp) {

            JOptionPane.showMessageDialog(null, " please call the addmainestrator " + exp.getMessage());

        } //finally used : ام لا يوجد execption   هتنفذ اللي جواها ثواء اذا وجد  
        finally {

            System.out.println("*****************************");
            System.out.println("thank u for using my programe");
            System.out.println("****************************");
        }

    }
}

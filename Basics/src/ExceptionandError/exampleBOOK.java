/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionandError;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class exampleBOOK {

    public static void main(String[] args) {

        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
              JOptionPane.showMessageDialog(null, "Exception thrown :" + e );
        }
        System.out.println("Out of the block");
    }
}


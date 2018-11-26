/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import javax.swing.JOptionPane;

/**
 *
 * @author shady
 */
public class Addtion {

    public static void main(String[] args) {

////        String obj1 = new String("Shady");
////
////        String obj2 = obj1;
////
////        if (obj1 == obj2) {
////            System.out.println("yes");
////        } else {
////            System.out.println("No");
////        }
////        /////////////////////////////////
////
////        String m = "sssssssssssssssSSSSSSSSSSSMMMMMMMMMMMmmmmmmmmmm";
////        String n = "mm";
////
////        if (m.equals(n)) {
////
////            System.out.println("equals :: yes");
////        } else {
////            System.out.println("equals :: No");
////        }
////        /////////////////////////////////
////
////        System.out.println("lower :: "+m.toLowerCase());
////        
////        System.out.println("upper :: "+m.toUpperCase());
////        
        //////////////////////////
        String showInputDialog = JOptionPane.showInputDialog(null, "Please Enter Number !", "Example 5.1 input ", JOptionPane.QUESTION_MESSAGE);

        if (isPlaindrome(showInputDialog)) {
            JOptionPane.showMessageDialog(null, showInputDialog + " is Plaindrome ");

        } else {
            JOptionPane.showMessageDialog(null, showInputDialog + " isn't Plaindrome ");
        }

    }

    public static boolean isPlaindrome(String s) {

        int low = 0;

        int hight = s.length() - 1;

        while (low < hight) {

            System.out.println("index low ::" + low + "  index hight ::" + hight);
            System.out.println("low ::" + s.charAt(low) + "     hgih::" + s.charAt(hight));

            if (s.charAt(low) != s.charAt(hight)) {
                System.out.println("index low ::" + low + "  index hight ::" + hight);
                System.out.println("low ::" + s.charAt(low) + "     hgih::" + s.charAt(hight));
                return false;
            }

            low++;
            hight--;

        }
        return true;

    }

}

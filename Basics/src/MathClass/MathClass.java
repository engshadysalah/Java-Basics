package MathClass;

import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rm
 */
public class MathClass {

    public static void main(String[] args) {

        String s1 = JOptionPane.showInputDialog(null, "enter num 1");

        double n1 = Double.parseDouble(s1);

        String s2 = JOptionPane.showInputDialog(null, "enter num 2");

        double n2 = Double.parseDouble(s2);

        System.out.println(Math.max(n1, n2));

        System.out.println(Math.min(n1, n2));

        System.out.println(Math.pow(n1, n2));

        System.out.println(Math.sqrt(n2));

        System.out.println(Math.abs(n1));   //abstract قيم مجرده    حيث يعرض القيمه من غير اشارتها

        System.out.println(Math.round(n1));//بيقرب

        System.out.println(Math.PI);

        System.out.println(Math.log(n1));
        System.out.println(Math.log(Math.E));

        System.out.println(Math.exp(1));

        System.out.println(Math.rint(-2.5));
        System.out.println(Math.rint(2.5));
        System.out.println(Math.rint(3.7));

        System.out.println(Math.round(0.5));
        System.out.println(Math.round(2.5f));
        System.out.println(Math.round(0.4));

        System.out.println(Math.ceil(0.5));
        System.out.println(Math.floor(0.5));

    }
}

package ARRAY;

import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rm
 */
public class Student {

    public static void main(String[] args) {

        int x = 0;

        while (x == 0) {

            String s1 = JOptionPane.showInputDialog(null, "Enter The Number of Subject");
            if (s1.matches("[\\d]*")) {

                int n1 = Integer.parseInt(s1);

                int Degree[] = new int[n1];

                String result = "  ";
                int sum = 0;

                for (int i = 0; i < n1; i++) {

                    String s2 = JOptionPane.showInputDialog(null, "Enter The Degree" + (i + 1));
                    if (s2.matches("[\\d]*")) {
                        int n2 = Integer.parseInt(s2);

                        Degree[i] = n2;

                        if (n2 > 100 && n2 < 0) {
                            // System.out.print("Erro");

                            result += "\n ERROR\n";
                        } else if (n2 <= 100 && n2 >= 85) {
                            result += "\n Exelant\n";
                        } else if (n2 < 85 && n2 >= 75) {
                            result += "\n Very good\n";
                        } else if (n2 < 75 && n2 >= 65) {
                            result += "\n good\n";
                        } else if (n2 < 65 && n2 >= 50) {
                            result += "\n Ma2bol\n";
                        } else if (n2 < 50) {
                            result += " \n Vashel\n";
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "ERRor");
                    }

                    sum = sum + Degree[i];

                }
                /* for(int i=0;i<n1;i++){
                                          System.out.print(Degree[i]);
                                                 }*/

                int totalgrade = sum / n1;

                result += "\n" + totalgrade;

                JOptionPane.showMessageDialog(null, result);

            } else {
                JOptionPane.showMessageDialog(null, "ERRor");
            }

            x = JOptionPane.showConfirmDialog(null, "If U Want Tray again Press Yes");
        }

    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Constractor;

/**
 *
 * @author rm
 */
public class program1 {

    public program1(int x1, int x2, int x3) {

        int sum = x1 + x2 + x3;

        System.out.println(sum);

    }

    private int num1;
    private int num2;

    public program1(int numm1, int numm2) {

        num1 = numm1;
        num2 = numm2;

    }

    public int summ() {

        int result = num1 + num2;

        System.out.println(result);

        return result;

    }

    public program1(double aa) {

        double re = 1;

        for (int ii = 1; ii <= aa; ii++) {
            re = re * ii;

        }

        System.out.print(re);

    }
  
}

package ARRAY;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rm
 */
public class SumLow {

    public static void main(String[] args) {

        // x[][]=new double [3][3];
        double x[][] = {{1, 1, 1}, {2, 3, 4}, {2, 3, 4}};
        for (int i = 0; i < 3; i++) {
            double sum = 0;

            for (int j = 0; j < 3; j++) {
                sum += x[i][j];

            }
            System.out.println(sum);
        }

    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Constractor;

/**
 *
 * @author rm
 */
public class MainClass1 {

    public static void main(String[] args) {

        program1 p1 = new program1(2, 3, 1);

        program1 p2 = new program1(1, 2);

        p2.summ();

        program1 p3 = new program1(3);

    }
  
    // BOOK 185
    @Override
    protected void finalize() {
// finalization code here
        System.out.println("finalization code here");
}
}

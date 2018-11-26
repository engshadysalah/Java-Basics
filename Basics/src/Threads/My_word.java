/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author rm
 */
// Single Thread whic is sequanc is called  main thread
public class My_word {

    private int Docu = 0;

    public static void main(String[] args) {

        My_word obj1 = new My_word(1);
        My_word obj2 = new My_word(2);
        My_word obj3 = new My_word(3);
        My_word obj4 = new My_word(4);

        obj1.Write();
        obj2.Write();
        obj3.Write();
        obj4.Write();



    
    }

    public My_word(int documeent) {

        Docu = documeent;

    }

    public void Write() {

        for (int row = 0; row < 100; row++) {

            System.out.println(Docu + " - Curent Row  " + row);

        }

    }
}

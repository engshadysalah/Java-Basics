/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorephism;

/**
 *
 * @author rm
 */
public class MainClass {

    public static void main(String[] args) {

        ClassAsaPramiter pra = new ClassAsaPramiter();

        Ssuperclass cl = new Ssuperclass();

        pra.tellNow(cl);

        Subclass1 sub1 = new Subclass1();
        pra.tellNow(sub1);

        Subclass2 sub2 = new Subclass2();
        pra.tellNow(sub2);

        ////////////////////////////////Overloding///////////////
        overloding over = new overloding();
        over.OverLoding();

    }

}

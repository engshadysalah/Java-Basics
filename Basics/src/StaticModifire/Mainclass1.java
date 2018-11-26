/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticModifire;

/**
 *
 * @author rm
 */
public class Mainclass1 {

    public static void main(String[] args) {

        program1 p1 = new program1("shady", "cairo");
        System.out.println(p1);

        program1 p2 = new program1("salah", "egypt");
        System.out.println(p2);

        program1 p3 = new program1("said", "elsalam");
        System.out.println(p3);

        program1 p4 = new program1("pop", "egypt");
        System.out.println(p4);
        System.out.println(p1.id);
        program1 p5 = new program1("pop", "egypt");
        System.out.println(p5);

        System.out.println(p2.id);
        System.out.println(p5.id);

    }
}

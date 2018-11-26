/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Composition;

/**
 *
 * @author rm
 */
public class MainClass {

    public static void main(String[] args) {

        program2 p2 = new program2("shady", "salah");

        program1 p1 = new program1(p2, "skld;ls");

        System.out.println(p1);
    }
}

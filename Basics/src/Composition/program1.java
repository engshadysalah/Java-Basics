/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Composition;

/**
 *
 * @author rm
 */
public class program1 {

    private String s1;

    private program2 object;

    public program1(program2 myopj, String name) {

        s1 = name;

        object = myopj;
    }

    // Override
    @Override
    public String toString() {

        return String.format(" %s, and My cit is %s ", object, s1);

    }
}

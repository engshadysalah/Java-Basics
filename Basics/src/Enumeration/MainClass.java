/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeration;
//import static java.lang.System.out;

import java.util.EnumSet;

/**
 *
 * @author rm
 */
public class MainClass {

    public static void main(String[] args) {

        //to showw all information insid the inemoretion
        for (Enumeration object : Enumeration.values()) {

            // System.out.printf("s%,s%,s%",object,object.getcountry(),object.getpopulation());
            System.out.println(object + "\t" + object.getcountry() + "\t" + object.getpopulation());
        }

        /////////////////////////////////////////////////
        // to showw one information insid the inemoretion
        String s1, s2;

        s1 = Enumeration.Egypt.getcountry();

        s2 = Enumeration.Egypt.getpopulation();

        //System.out.printf("my country is: s% \t s\t%",s1,s2);
        System.out.println(s1 + "\t" + s2);

        ///////////////////////////////////////////
        //to some all information insid the inemoretion
        for (Enumeration objject : EnumSet.range(Enumeration.USA, Enumeration.esomal)) {

            System.out.println(objject + "\t" + objject.getcountry() + "\t" + objject.getpopulation());

        }

    }
}

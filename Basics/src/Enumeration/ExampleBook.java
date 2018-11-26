/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeration;

import java.util.Vector;

/**
 *
 * @author root
 */
public class ExampleBook {

    public static void main(String args[]) {
      
        java.util.Enumeration days;

        Vector dayNames = new Vector();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        dayNames.add(1);
        dayNames.add(true);

        days = dayNames.elements();
        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
    }
}


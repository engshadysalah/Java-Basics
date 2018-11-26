/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author shady
 */
public class StringMethodes {

    public static void main(String[] args) {

        String myNaem = "sahdy sAlah";

        System.out.println("" + myNaem.length());

        System.out.println("" + myNaem.charAt(4));

        String fName = "fares";
        String Lname = "cc";

        String con = fName + " " + Lname;

        System.out.println(con);

        String fullName = "Shady salah mabrouk";

        String subNAme = fullName.substring(6, 10);
        System.out.println(subNAme);
    }
}

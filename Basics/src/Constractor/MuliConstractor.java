/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Constractor;

/**
 *
 * @author rm
 */
public class MuliConstractor {

//اعمل اكتر من كونسترمتور لاكن  مش نفس البرميتر  يعني الكونستركتور الاول ملشو براميتر يبقا مش يمكن اعمل كمان  كونستركنور  بدون برامتر يبقا لازم اديلو برامتر والكونستركتور التالت يبقا ليه براميتر غير الاول  وهكذا
//     Overloding
    public MuliConstractor() {

        System.out.println("Iam the firest constractor Without Pramitar");

    }

    public MuliConstractor(String name) {

        System.out.println("Iam the Second constractor With String Pramitar" + name);
    }

    public MuliConstractor(int number) {

        System.out.println("Iam the .... constractor With integer Pramitar  :" + (number));

    }

    public MuliConstractor(String fname, String lname) {

        System.out.println("Iam the Thired constractor With String Pramitar" + fname + lname);

    }

    public MuliConstractor(int num1, int num2) {

        System.out.println("Iam the Four constractor With integer Pramitar  :" + (num1 + num2));

    }

    public MuliConstractor(double num1, double num2) {

        System.out.println("Iam the five constractor With integer Pramitar  :" + (num1 + num2));

    }
    
      
     

}

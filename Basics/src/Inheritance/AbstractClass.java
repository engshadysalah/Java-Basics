/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author rm
 */
public  abstract class AbstractClass {
    //meaning:   بحمي الكلاس بنتاعي ومخليش حد ينفع ياخد منه اوبجكت
    //but " ممكن اورث منه لاكن مش اخد منه اوبجكت
    //and ممكن يعمل ريفرانس لاي كلاس يرث منه

    public static void main(String[] args) {

        /*     
   //when run then: "at Inheritance.AbstractClass.main(AbstractClass.java:18)"
   
   Ssuperclass Ss=new Ssuperclass();
    
   Ss.gender();
         */
        Ssuperclass Ss1 = new Subclass1();
        //meaning: object(Ss1) is sort of Ssuperclass but the refrance is from Subclass1
        Ss1.drink();

        Ssuperclass Ss2 = new Subclass2();

        Ssuperclass Ss3 = new SubClassOFsubclass1();

        
        
        }
    

}

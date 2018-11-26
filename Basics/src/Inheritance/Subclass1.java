/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author rm
 */
public class Subclass1 extends Ssuperclass{
   
     @Override//meaning:اعدل في الصفات الموروثه
    //then:وبالتالي لما اخد اوبجكت من الاكلاس ده الذي به الميثود المعدله وانفذ تلك الميثود فان الميثود الجديدة المعدله هي التي تنفذ ولا تفذ  الميثود القديمة
      public void walk(){
    
    System.out.println("Iam walking (Override)");
            
    }
   
}

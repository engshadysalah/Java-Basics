/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticMethods;

/**
 *
 * @author rm
 */
public class program2 {
    
    //frist way to : اعمل ميثود واستدعيها في نفس الكلاس
    private static void print1(){
    
    System.out.println("iam special method 1");
    
    }
   
     //second way to : اعمل ميثود واستدعيها في نفس الكلاس
   
    private void print2(){
    
    System.out.println("iam special method2");
    }
    
    
    private static String s1="shady";
    private String s2="salah";
   
    public static void main (String []args){
    
        // static
    print1();
    program2.print1();
    
    //take refrance from class
    program2 p=new program2();
     p.print2();
    
     
     
     System.out.println(s1); //static
     System.out.println(p.s2);//non static
      
     
     
    }
    
}

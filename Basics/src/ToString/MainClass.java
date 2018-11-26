/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ToString;

/**
 *
 * @author rm
 */
public class MainClass {
    

     public static void main (String[]args){
    
   program1 p1=new program1(2);
   
    p1.summ();
   
   
   
   System.out.println(p1);
           
   System.out.println (p1.toString());
   
   
   System.out.print(p1);
   
   
   
   program2 p2=new program2("pop", "Cairo");
  
   System.out.println (p2.toString());
    System.out.print(p2);
  
   
}
}
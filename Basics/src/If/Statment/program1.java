/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package If.Statment;

import javax.swing.JOptionPane;

/**
 *
 * @author rm
 */
public class program1 {
    public static void main(String[]args){
    
   //int age =14;
    String s =JOptionPane.showInputDialog(null, "enter age");
      
   int age=Integer.parseInt(s);
   
    if (age >=20)
      //    
    System.out.print("u are grown");  
       // esle
    System.out.println("1");  
      
    System.out.println("2");  
    
    System.out.println("3");  
    
   ////////////////////////////////////////////////////////////
    
   String valu=(age >=20)?   "young"  :  "child";
    
    System.out.println(valu);  
    
    
   
    
    }
}

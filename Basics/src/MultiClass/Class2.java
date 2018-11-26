/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiClass;

import java.util.Locale;

/**
 *
 * @author rm
 */
public class Class2 {
  
     
          
          
     
     private String name;
      
      private  String foramt(){
      
      return (name.toUpperCase());
      
      }
     
      /////////////////////////////////////////
      
      
      public String nammm(String fristname,String lastname){
      
      
      
      name=fristname+" "+lastname;
      
      String valu=foramt();
      
      return valu;
      
      }
}
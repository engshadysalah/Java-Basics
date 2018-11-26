/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticModifire;

/**
 *
 * @author rm
 */
public class program1 {
    
   private String name;
   private String country;
   
   public static int id;

    public program1(String myname,String mycountry) {
        
        name =myname;
        country=mycountry;
        
        id++;
        
      //  System.out.printf("THE Information is ".concat(name+country+id)+"\n");
    
        System.out.printf("THE Information is ",this+"\n");
    }
   
   
    @Override
   public String toString(){
   
   return String.format("The Name :%s , The Country :%s  (The ID =%d)", name,country,id);
   
  
           
   
   } 
   
}

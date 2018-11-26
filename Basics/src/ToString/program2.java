/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ToString;

/**
 *
 * @author rm
 */
public class program2 {
   
    
    private String s1;
    
    private String s2;
    
    public program2(String name,String country){
    
    s1=name;
    s2=country;
    
     }
    
   // Override
    @Override
    public String toString(){
    
    
    
    return String.format("My name is %s,andMy Country is%s", s1,s2);
    
    }
}

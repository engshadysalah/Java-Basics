/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author rm
 */
public class MainClass {

    public static void main(String[] args) {

        /*  
    Subclass1 s1=new Subclass1();
    
    Subclass2 s2=new Subclass2();
    
     s1.walk();
     s2.walk();
    
    
    s1.setname("shady");
     
    String ss=s1.getname();
        
    System.out.println(ss);
         */
        ///////////////////////////////////////////////////
        SubClassOFsubclass1 sub1 = new SubClassOFsubclass1();

        sub1.walk();
        
        
        //then SubClassOFsubclass1 inhretantor to SsuberClass and SubClass1
      
        //////////////////////////////////////////////////////////////////////////
      
        
        String type = Ssuperclass.type;
          
        System.out.println("type"+type);
        
        
        
        
        
        Ssuperclass s=new Ssuperclass() {
            @Override
            public void walk() {
                System.out.println("sss");
            }
        };
        
        s.walk();;
    }

}

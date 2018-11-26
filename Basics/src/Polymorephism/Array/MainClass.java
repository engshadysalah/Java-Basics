/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorephism.Array;

/**
 *
 * @author rm
 */


public class MainClass {
    
    
    // array contain objectes of class that inhertant from  Ssuperclass
    
    public static void main (String[]args){
  
    Ssuperclass[] Ssu=new Ssuperclass[2];
  //Ssuperclass Ssu[]=new Ssuperclass[2];
   
    Ssu[0]     =new Subclass1();
    
    Ssu[1]    =new Subclass2();
   
  for(int count=0;count<Ssu.length;count++){
  
  
      Ssu[count].tellme();
      System.out.println("");
  
  }
  ////////////////////////////////////////////////////////////////////////////////
  
    Ssuperclass Ssu2[]=new Ssuperclass[2];
    
    Subclass1 Sub1=new Subclass1();
    
    Subclass2 Sub2=new Subclass2();
    
  
    Ssu2[0] =Sub1;
    Ssu2[1] =Sub2;
    
 for(int count=0;count<Ssu.length;count++){   
//for(Ssuperclass object :Ssu){
      
    
    Ssu[count].tellme();
    
    }
  
    
 ////////////using final
 
 
 FinalClassandMethod finall=new FinalClassandMethod();
 
 finall.eat();
 
}
}
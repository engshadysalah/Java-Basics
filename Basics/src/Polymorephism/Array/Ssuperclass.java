/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorephism.Array;

/**
 *
 * @author rm
 */
 public class Ssuperclass {
      
  private static String  name;
  private int age;
  public String gender;
  private String skinColoer;
  public static String type="Human";
 
  /*
  public Ssuperclass(String hname,int hage,String hgender,String hskinColoer){
  
  name=hname;
  age=hage;
  gender=hgender;
  skinColoer=hskinColoer;
  
  }
     
    */
  
   public void tellme(){
   
   System.out.println("Iam Suber Class");
   
   }
 
  
  public static void  setname(String myname){
      
      name=myname;
      
            }
      
    public String getname(){
  
  return name;
  }
  
    
    
 public void setskinColoer(String hskinColoer){
  
 skinColoer=hskinColoer;
  }
    
  public String getskinColoer(){
  
  return skinColoer;
  } 
  
    
    public  final void eat(){
    
    System.out.println("Iam eating");
            
    }
    
     public void drink(){
    
    System.out.println("Iam drinking");
            
    }
    
     
     
      public void walk(){
    
    System.out.println("Iam walking");
    }
      
    
   
    
    
      public  void Setage(int hage){
      
      this.age=hage;
      }
      
      public int getage(){
  
         return age;
      } 
 
      
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsolation;

/**
 *
 * @author rm
 */
public class Enc {
    
   //Encapsolation : يبقا الميثوداد اللي اليوسر مش هيستخدمها ولا هتهمه  يبقا لازم اخليها برايفت
    //and :الحاجات اللي اليوسر هيستخدمها ويتعامل معها يبقا نخليها بابلك
    //example : keypaord
    //remeber: protected : is access modifier but   (subclass يستخدم للكلاسات التي ترث  يعني لل )
    //in the smae class and subclassand suberclass in samepackegt and diiferent packegt in  subclass and allcalss in the same packegt
    //defult :is access modifier but not protected and not public and not private وبيكون مرئي لكل الكلاسات اللي في نفس الباكتج فقط ولاكن يكون غير مرئي للكلاسات اللي في لاكتج اخرى
  
    
    //wrie onely then use set
    
    //read only then use get
    public static void main(String[]args){
    
    
    }
   
    
    
 // Write Onely  : then remove get
    
  private String s1;
  
  public void setcount(String country){
  
  this.s1=country;
  
  }
/*  
  public  String getcount(){
  
  return s1;
  
  }*/
     
  
  
  
  // Red Onely  : then remove Set
  
   private String s2;
 /* 
  public void setadd(String addres){
  
  this.s1=addres;
  
  }*/
  
  public  String getaddt(){
  
  return s2;
  
  }
  
  
  
}

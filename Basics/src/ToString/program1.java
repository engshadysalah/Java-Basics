/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ToString;

/**
 *
 * @author rm
 */
public class program1 {
    
    
 private int num;
   
 public program1(int numm1){
 
 
num=numm1;
 
  }
  
 public int summ(){
 
 
 int result=num*2;
 
 System.out.println(result);
    
 return result;
         
 }


//overRide
    @Override
public String toString(){


return "hi shady";

}


}

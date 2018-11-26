/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY;

/**
 *
 * @author rm
 */
public class program5 {
    public static void main (String[]args){
    
    
        // enhanced for statment
        // The foreach Loops:
        
        
    int arr[]={10,15,63,65,88,78,98};
    
    int sum=0;
    for(int count : arr){
    
    System.out.print(count+" ");
    
    sum+=count;
    }
    System.out.println("the summ is \n"+sum+" ");
    
    //////////////////////////////////////////////////////////
    
    String arrnames[]={"salah","pop","shady"};
    
    
    for(String names : arrnames){
    
    
    System.out.printf("name is \t %s\n" ,names);
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    }
}

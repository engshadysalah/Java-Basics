/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY;

/**
 *
 * @author rm
 */
public class program1 {
    public static void main(String[]args){
    
    String address[]={"Egypt","Cairo","bulidining ","pop","phone"};

    
    System.out.println(address.length);
    
    for(int ind=0;ind<address.length;ind++)
    {
      System.out.printf("address is :%s\t  index :%d \n ",address[ind] , ind); //print f  :take 2 pramiters
    
     // String.format("%d", ind); ????!!!
    }
    
    }
    
}

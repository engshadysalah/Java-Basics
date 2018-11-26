/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LooP;

import javax.swing.JOptionPane;

/**
 *
 * @author rm
 */
public class program3 {
 
    public static void main (String[] args){
   
    String s1=JOptionPane.showInputDialog(null,"enter assas");
    int start=Integer.parseInt(s1);
            
     
    String s2=JOptionPane.showInputDialog(null,"enter assas");
    int end=Integer.parseInt(s2);
    
    
    int sum =0;
    for(int x=start;x<=end;x++){
    
        sum=sum+x;
    }
    JOptionPane.showMessageDialog(null,sum);
    
}
}
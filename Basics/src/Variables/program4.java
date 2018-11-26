/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Variables;

import java.util.StringTokenizer;

/**
 *
 * @author rm
 */
public class program4 {
 public static void main (String[]args){
 
 String
         
         firstName="  sHAdy   " ,
       
         lastName="    salaH    ";
 
 
 //---------------------------------------------------
 int len1=firstName.length();   
 
 int len2=lastName.length();
     
     System.out.println(len1+"\n"+len2);
             
 //-----------------------------------------------------
     
     firstName=firstName.trim();
     lastName=lastName.trim();
     System.out.println(firstName+"\n"+ lastName);
 
 //-----------------------------------------------------

   String  s1=firstName.toUpperCase();
         
   String  s2=lastName.toUpperCase();
   
   System.out.println(s1+"\n"+ s2);
 
 //-----------------------------------------------------
   
   String  ss1=firstName.toLowerCase();
         
   String  ss2=lastName.toLowerCase();
   
   System.out.println(ss1+"\n"+ ss2);
  
 //------------------------------------------------------
     
   int index1,index2;
   
   index1=firstName.indexOf("H");
           
   index2=lastName.indexOf("H");      
   
  System.out.println(index1+"\n"+ index2);
 
 //------------------------------------------------------
 
   String sub1,sub2;
   sub1=firstName.substring(0,3);
   sub2=lastName.substring(0,5);
   System.out.println(sub1+"\n"+ sub2);


 //------------------------------------------------------
 String rep1,rep2;
   rep1=firstName.replace("H","7");
   rep2=lastName.replace("a","6");
   System.out.println(rep1+"\n"+ rep2);

 //------------------------------------------------------
   
// ازاي اعمل انقسام لما احفظ اكتر من قيمة في متغيرString  //       
   
   
   String city="egypt:cairo:Alex:Darelsalam";
   
   String [] add=city.split(":");
 
System.out.println(add[0]);
System.out.println(add[1]);
System.out.println(add[2]);
System.out.println(add[3]);

//---------------------------------------------------------

String s=firstName.intern();
System.out.println("intern    : " +s);

String ss=new String("jhskddhnjn");
System.out.println(ss);

//System.out.println(s.compareTo(ss));

System.out.println(ss==s);

//---------------------------------------------------------

  // Create a string and string tokenizer

    String sss= "I+am-learning?Java.";
    
    StringTokenizer st = new StringTokenizer(sss, "+-");

    // Retrieve and display tokens
      while (st.hasMoreTokens())
      System.out.print(st.nextToken() + " ");
    
    //---------------------------------------------------------
      
    
    
    String x="abc";
    
    String z=x.concat("def").toUpperCase();
    
         System.out.println("\n"+z);
         

  //----------------------------------------------------------------
     
            
     //   String[] xxx = new String[3];
   //System.out.println("s[0] is " + xxx[0].toString());
   
         
         
 }   
}

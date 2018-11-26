/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author rm
 */
abstract public class Ssuperclass {

    private static String name;
    private int age;
    public String gender;
    private String skinColoer;
    public static String type = "Human";

    /*
  public Ssuperclass(String hname,int hage,String hgender,String hskinColoer){
  
  name=hname;
  age=hage;
  gender=hgender;
  skinColoer=hskinColoer;
  
  }
     
     */
    public static void setname(String myname) {

        name = myname;

    }

    public String getname() {

        return name;
    }

    public void setskinColoer(String hskinColoer) {

        skinColoer = hskinColoer;
    }

    public String getskinColoer() {

        return skinColoer;
    }

    private void eat() {

        System.out.print("Iam eating");

    }

    public void drink() {

        System.out.println("Iam drinking");

    }

    /*
      public void walk(){
    
    System.out.println("Iam walking");
    }
     */
    abstract public void walk();

    public void Setage(int hage) {

        this.age = hage;
    }

    public int getage() {

        return age;
    }

}

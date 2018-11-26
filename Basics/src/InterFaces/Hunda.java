/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterFaces;

import java.awt.Color;

/**
 *
 * @author rm
 */

//mark : This Class (Hunda) is implemented for 2 interfaces ( CarNewInterface and TransportationNewInterFace )

public class Hunda implements CarNewInterface, TransportationNewInterFace{

    @Override
    public void Start() {
        System.out.println("Hunda Start");
     }

    @Override
    public void Step() {
         System.out.println("Hunda Stop");
    }

    @Override
    public void Move() {
     }

    @Override
    public void ChangOil() {
    }

    @Override
    public Color CarColor() {
 
        return null;
    }

   @Override
    public String model() {
        return "pop";
    }
     
public CarNewInterface getInfor() {
   
      Hunda h=new Hunda();
        
           return h;
      
    
    }







    @Override
    public int Speed() {
   
      return 110;
    }

    @Override
    public int Time() {
   
        return 0;
    }

    @Override
    public void Shipping() {
    
    }

    @Override
    public double Cost() {
  
        return 0.0; 
    }
       
    
    
}

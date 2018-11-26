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
public class Mitsubishi implements CarNewInterface{
    
     @Override
    public void Start() {
     }

    @Override
    public void Step() {
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
        return null;
    }
      
 public CarNewInterface getInfor() {
   
      Mitsubishi m=new Mitsubishi();
        
           return m;
      
    
    }
    
 
 
 
 
    
}

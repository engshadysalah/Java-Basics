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
public class Fiat implements CarNewInterface{
    
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

    @Override
    public CarNewInterface getInfor() {
   
        Fiat f=new Fiat();
        
        return f;
    }
    
 
}

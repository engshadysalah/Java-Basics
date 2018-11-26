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

//mark : This Class (CoroMoro) is implemented for 2 interfaces ( CarNewInterface and TransportationNewInterFace )

public class CoroMoro extends Coro implements TransportationNewInterFace{

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
    public String model() {
   
        return null;
    }

    @Override
    public Color CarColor() {
    
        return null;
    }
   
    /*
    
    //get infometion about each car
    //Mark:new malhoZa : the method datatyp is the same name of the class that contain it  
    //                  and this method is return
    public CoroMoro getInfor(){
    
      CoroMoro m=new CoroMoro();
        
      return m; 
    }
    * 
    */

    @Override
    public CarNewInterface getInfor() {
   
       Toyota t=new Toyota();
        
           return t;
      
    
    }

    @Override
    public int Speed() {
       
        return 0;
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

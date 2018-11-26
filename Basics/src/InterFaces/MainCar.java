/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterFaces;

/**
 *
 * @author rm
 */
public class MainCar {

    public static void main(String[] args) {

        MainCar mc = new MainCar();

        //dinamic
        // Hunda h=new Hunda();
        CarNewInterface h = new Hunda();
        System.out.println(getcarinfor(h));

        //dinamic
        Toyota t = new Toyota();
        System.out.println(getcarinfor(t));

        // System.out.println(getcarinfor());
        //System.out.println(mc.getcarinfor());
        getcarstatus(h);

        boolean b = israce(h);
        System.out.println("is race  : " + b);

        //Casting classes :    
        /*         
  frist solution
       TransportationNewInterFace  hu= new Hunda();
       int sp= (int) getSpeed(hu);
         */
        //Second solution       
        int sp = (int) getSpeed((TransportationNewInterFace) h);

        System.out.println(sp);
    }

    //mark: one program can be epplayed on all classess (interface)
    /*
     public static Hunda getcarinfor(){
    
    Hunda h=new Hunda();
    
    return h;
    * } 
     */
    //Dinamic
    public static CarNewInterface getcarinfor(CarNewInterface c) {

        return c;

    }

    //to تنفذ ميثودات معينة في الكلاس اللي انا هدخله كبراميتر فلاحظ انها هنا تعرف من النوع فويد
    public static void getcarstatus(CarNewInterface c) {

        c.Start();
        c.Step();
        System.out.println(c.model()); //method with return valu

    }

    public static boolean israce(CarNewInterface c) {

        //instanceof (==) :if paramiter is fiat then return (false) else return (rtue)
        if (c instanceof Fiat) {

            return (false);
        }
        {
            return (true);
        }

    }

    //to :  تنفذ ميثود معينة من الكلاس اللي هدخله كبراميتر ولاحظ ان هذه اليثود لها  ريترن يعني بتفذ ميثوداد لها ريترن ولا يمكن ان تفذ ميثود من النوع فويد
    private static double getSpeed(TransportationNewInterFace c) {

        return (c.Speed());

        // return (c.Speed()+c.Cost());
    }

}

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
public interface CarNewInterface  {
    // not have codes : contain variables and method but not have consractor  

    //meaning: هو عبارة عن قالب يوضع فيه مجموعه من اللرامج   constatnt والميثود ويصبها يعني يعملها اامليمينت في كلاسات اخر
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //dont contain variable but contain  constatnt  => final
    //mark:  حتى وان لم يذكر صراحا public static final المخازن او الواجهات تحمل صقات   
    //meaning: عامة -مشتركة -ثابته لاتتغير قيمتها 
    //becose it is final then i must give him vale becose it is constant   
    public static final int whell = 4;

//mark:   تلقائي  abstract كل الميثود دي بتكون بابلك  ثواء انا كتبت انها بابلك ام لا وكذالك يتكون
    //   منغير ما اكتب 
    //meanu=ing :overrid اي انها برامج بدائية   يجب ان نعملها   
    public void Start();

    public void Step();

    public void Move();

    public void ChangOil();

    String model(); //method = public String model();

//i can add import to color 
//mark: CarColor Return valu
    Color CarColor();

    public CarNewInterface getInfor();  //methoud that its datatype is an CarNewInterface from 

}


// mark imporatant :L interfacse can extendes from more then one interface
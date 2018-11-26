/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomClass;

import java.util.Random;
import java.util.RandomAccess;
import javax.sound.midi.Sequence;

/**
 *
 * @author rm
 */
public class program1 {

    public static void main(String[] args) {

        Random ran = new Random();

        long num = 0;
        String s = "1";
        for (int count = 0; count < 100; count++) {

            num = ran.nextInt(200000);  //then random num from 0 t0 200000

            // num=ran.nextInt(2000)+1; //then random num from 1 t0 7 becouse add 1 ta the random num for ex 1+0=1
            //num=ran.nextLong();
            System.out.println(num + " ");
        }

        // Sequence x=(Sequence) Integer(num);
    }

}

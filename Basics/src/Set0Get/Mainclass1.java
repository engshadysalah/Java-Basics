/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Set0Get;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rm
 */
public class Mainclass1 {

    public static void main(String[] args) {

        program1 p1 = new program1();

        //p1.setcoller("shady salah");
        String res = p1.getcoller();
        System.out.println(res);

        List<String> indexPathes;

        indexPathes = new ArrayList<>();

        indexPathes.add("shady");
        indexPathes.add("salah");

        int id = 1;

        // p1.setsumm(1, 2);
        //int val=  p1.getsumm(); 
        System.out.println(indexPathes.get(id) + indexPathes.size());

    }
}

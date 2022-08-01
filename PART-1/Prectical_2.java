package Part_1;

import java.util.*;
import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Prectical_2 {
    public static void main(String[] args) {

        String o_z, ansoz;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of your String : ");
        o_z = sc.nextLine();
        ansoz = stirngOz(o_z);
        System.out.println(ansoz);
        sc.close();
        System.out.println("**THIS PROGRAM IS PREPARED BY DIVY_21CE134**");
    }

    public static String stirngOz(String oz) {
        String s1 = "";    //here s1 has no any value...
        if (oz.charAt(0) == 'o')  //if at 1st position has 'o' then add 'o' in s1..
            s1 = s1 + 'o';
        if (oz.charAt(1) == 'z')   //if at 2nd position has 'z' then add 'z' in s1..
            s1 = s1 + 'z';
        else
            System.out.println("No 'o' and 'z' available..");
        return s1;
    }
}

package Part_1;

import java.util.*;
import static java.lang.Math.min;

public class Prectical_5 {
    public static void main(String[] args) {
        Scanner obj_sc = new Scanner(System.in);

        String s1, s2;
        System.out.println("Enter value od string s1 : ");
        s1 = obj_sc.next();

        System.out.println("Enter value od string s2 : ");
        s2 = obj_sc.next();

        stringMatch(s1, s2);
        obj_sc.close();
        System.out.println("**THIS PROGRAM IS PREPARED BY DIVY_21CE134**");
    }
    public static void stringMatch(String s_1, String s_2) {
        int Min, count = 0;
        Min = min(s_1.length(), s_2.length());  //here min function is use for to gate small string in 2 strings.
        for (int i = 0; i < Min - 1; i++) {
            String st1 = s_1.substring(i, i + 2);
            String st2 = s_2.substring(i, i + 2);
            if (st1.equals(st2)) {    //here equals function is checking equality in 2 string. 
                count++;
            }
        }
        System.out.println(count);
    }
}

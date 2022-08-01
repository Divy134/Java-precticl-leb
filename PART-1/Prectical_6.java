package Part_1;

import java.util.*;

public class Prectical_6 {
    public static void main(String[] args) {
        Scanner obj_sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a size of array : ");
        n = obj_sc.nextInt();
        String[] st_arr = new String[n];
        System.out.println("Enter the elements of a array : ");
        for (int i = 0; i < st_arr.length; i++) {
            st_arr[i] = obj_sc.next();
        }
        System.out.println("Enter target string ");
        String tr_string;
        tr_string = obj_sc.next();
        wordsWithout(st_arr, tr_string);
        obj_sc.close();
        System.out.println("**THIS PROGRAM IS PREPARED BY DIVY_21CE134**");
    }

    static void wordsWithout(String s_arr[], String t_string) {
        int count = 0;
        for (int i = 0; i < s_arr.length; i++) {   //this for loop is for to remove--
            if (s_arr[i].equals(t_string)) {       //--a element which is same as atarget string.
                count++;
            }
        }
        String[] d = new String[s_arr.length - count];
        int temp = 0;
        for (int i = 0; i < s_arr.length; i++) {
            if (!s_arr[i].equals(t_string))
            {
                d[temp] = s_arr[i];
                temp++;
            }
        }
        System.out.println("New Array with out target string is :");
        for (String element : d) {
            System.out.println(element);
        }

    }
}

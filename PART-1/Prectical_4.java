package Part_1;

import java.util.*;

public class Prectical_4 {
    public static void main(String[] args) {
        Scanner obj_sc = new Scanner(System.in);

        int x; 
        int number;
        System.out.println("Enter a size of array : ");
        number = obj_sc.nextInt();     //get value of number..
        int[] intarr = new int[number];
        System.out.println("Enter a element of array : ");
        for (int i = 0; i < number; i++) {
            intarr[i] = obj_sc.nextInt();   // get value of array elements..
        }
        num_arr_123(intarr);
        System.out.println("**THIS PROGRAM IS PREPARED BY DIVY_21CE134**");
    }

    public static int num_arr_123(int[] arr) {
        int y = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == 1) {
                if (arr[i + 1] == 2) {
                    if (arr[i + 2] == 3) {
                        System.out.println("true");   //here 'true' means areay has only 1 2 3..
                    }
                }
            } else
            System.out.println("false"); // here false means array has outof 1 2 3 elements..
        }
        return y;
    }
}

package Part_1;

import java.util.*;

public class Prectical_3 {
    static boolean firstdigit(int x, int y) {    //by boolean we can return only 'true' or 'false' value.
        while (x >= 10) {
            x = x / 10;     //by this step we get the first digit of given number.
        }
        while (y >= 10) {
            y = y / 10;     //by this step we get the first digit of given number.
        }
        if (x == y) {       //Compair both number's first digit.
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of number 1 :");
        a = s.nextInt();
        System.out.println("Enter the value of number 2 :");
        b = s.nextInt();
        if (firstdigit(a, b)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("**THIS PROGRAM IS PREPARED BY DIVY_21CE134**");
    }
}

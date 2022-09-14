package Part_3.Part3_pr6;

import java.util.*;

public class Import_class {
    int number;

    public void setInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        number = sc.nextInt();
        sc.close();
    }

    public void getInfo() {
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println(+number + " is even number...");
            } else {
                System.out.println(+number + " is odd number...");
            }
        }
        else
        {
            System.out.println("Enter any non-zero number...");
        }
    }
}

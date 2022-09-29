//"**THIS PROGRAM IS PREPARED BY DIVY_21CE134**
package Part_6;

import java.util.*;

public class Practical2 {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < 15; i++) { // random elements in array
            array[i] = new Random().nextInt(100);
        }

        System.out.println("The array is : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n\n Thread is start...");

        Thread thread1 = new Thread() { // thread for printing odd indexes of array
            public void run() {
                for (int i = 1; i < 10; i = i + 2) {
                    System.out.println("Odd Number : " + array[i]);
                }
            }
        };
        Thread thread2 = new Thread() { // thread for printing even indexes of array
            public void run() {
                for (int i = 0; i < 10; i = i + 2) {
                    System.out.println("Even Number : " + array[i]);
                }
            }
        };
        thread1.start();
        thread2.start();
    }
}
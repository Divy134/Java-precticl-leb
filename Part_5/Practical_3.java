// **THIS PROGRAM IS PREPARED BY DIVY_21CE134*
package practice.Part_5;

import java.io.*;
import java.util.*;
public class Practical_3 {
    public static void copyContent(File a, File b)
            throws Exception {
        FileInputStream input = new FileInputStream(a);
        FileOutputStream output = new FileOutputStream(b);
        try {
            int n;
            while ((n = input.read()) != -1) { // using write() function we can write in file.
                output.write(n);
            }
        } finally {
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }
        }
        System.out.println("File is Copied");
    }
    public static void main(String[] args) throws Exception {
        Scanner obj_sc = new Scanner(System.in);
        System.out.println("Enter filename from where you have to read:");
        String a = obj_sc.nextLine();

        File x = new File(a);
        System.out.println("Enter filename where you have to write:");
        String b = obj_sc.nextLine();
        File y = new File(b);

        copyContent(x, y);
        obj_sc.close();
    }
}

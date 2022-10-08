// **THIS PROGRAM IS PREPARED BY DIVY_21CE134**
package practice.Part_5;
import java.io.*;
public class Practical_1 {
    public static void main(String[] args) {
        String path = "";
        boolean b = false;
        try {
            File f1 = new File("testFile1.txt");
            f1.createNewFile();
            System.out.println(f1);
            File f2 = f1.getCanonicalFile();
            System.out.println(f2);
            b = f2.exists();
            path = f2.getAbsolutePath();
            System.out.println(b);
            if (b) {
                System.out.print(path + " Exists? " + b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
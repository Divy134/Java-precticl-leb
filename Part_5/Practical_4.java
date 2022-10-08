//**THIS PROGRAM IS PREPARED BY DIVY_21CE134**
package practice.Part_5;

import java.io.*;
public class Practical_4 {
    public static void main(String[] args) {
        FileInputStream finput = null;
        FileOutputStream foutput = null;
        try {
            finput = new FileInputStream("InputFile.jpg");
            foutput = new FileOutputStream("OutputFile.jpg");
            int temp;
            while ((temp = finput.read()) != -1) {
                foutput.write(temp);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        } 
        finally {
            if (finput != null) {
                try {
                    finput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (foutput != null) {
                try {
                    foutput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

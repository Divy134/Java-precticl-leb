// **THIS PROGRAM IS PREPARED BY DIVY_21CE134**
package practice.Part_5;

import java.io.*;
public class Practical_2 {
    public static void main(String[] args)
            throws IOException {
        FileReader sourceStream = null;       
        try {    // Try block to check for exceptions
            sourceStream = new FileReader("/Users/mayanksolanki/Desktop/demo.rtf");

            int temp;   //read the file.
            while ((temp = sourceStream.read()) != -1)
                System.out.println((char) temp);
            System.out.print("Program is successfully executed");  //display the message.
        }
        finally {
            if (sourceStream != null)
                sourceStream.close();
        }
    }
}


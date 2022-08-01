package Part_1;

import java.util.*;
public class Prectical_10 {
    public static final String AtoZ = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String Text, int s) {
        Text = Text.toLowerCase();
        String cipher;
        cipher = "";
        for (int i = 0; i < Text.length(); i++) {
            int char_po = AtoZ.indexOf(Text.charAt(i));
            int keyVal = (s + char_po) % 26;
            char replaceVal = AtoZ.charAt(keyVal);
            cipher += replaceVal;
        }
        return cipher;
    }

    public static String decrypt(String cipher, int shiftKey)
    {
        cipher = cipher.toLowerCase();
        String text = "";
        for (int i = 0; i < cipher.length(); i++) {
            int charPosition = AtoZ.indexOf(cipher.charAt(i));
            int value = (charPosition - shiftKey) % 26;
            if (value < 0) {
                value = AtoZ.length() + value;
            }
            char replaceVal = AtoZ.charAt(value);
            text += replaceVal;
        }
        return text;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String for Encryption: ");
        String msg = new String();
        msg = sc.next();
        System.out.println(encrypt(msg, 3));
        System.out.println(decrypt(encrypt(msg, 3), 3));
        sc.close();
        System.out.println("**THIS PROGRAM IS PREPARED BY DIVY_21CE134**");
    }
}

package Part_1;

import java.util.*;
public class Prectical_8 {
    public static void main(String[] args) {
        Scanner obj_sc = new Scanner(System.in);
        int stu,que;
        System.out.print("Enter the number of student : ");
        stu = obj_sc.nextInt();
        System.out.print("Enter the number of Question : ");
        que = obj_sc.nextInt();

        String[][] exam = new String[stu][que];
        for (int i = 0; i < stu; i++) {
            System.out.print("Student " + (i+1) + " : ");  // to get Student's answer.
            for (int j = 0; j < que; j++) {
                exam[i][j] = obj_sc.next();
            }
        }
        System.out.println("Enter the origenal Key of all Qustions : ");
        String[] key = new String[que];       
        for (int i = 0; i < que; i++) {      // to get answer key.
            key[i] = obj_sc.next();
        }
        int mark[] = new int[stu];
        for (int i = 0; i < stu; i++) {
            int temp = 0;
            for (int j = 0; j < que; j++) {
                if (exam[i][j].equals(key[j])) {    //comparision of stu's ans and ans key.
                    temp++;
                    mark[i] = temp;
                }
            }
        }
        System.out.println("----The total mark of all students----");
        System.out.println("--.--.--.--.--.--.--.--.--.--.--.--.--");
        for (int i = 0; i < stu; i++) {
            System.out.println("Student " + (i+1) + " : " + mark[i]);
        }
        obj_sc.close();
        System.out.println("**THIS PROGRAM IS PREPARED BY DIVY_21CE134**");
    }
}

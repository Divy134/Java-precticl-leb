// **THIS PROGRAM IS PREPARED BY DIVY_21CE134**
package Part_7;
import java.util.*;

class AccountHolder {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    int experience;
    double inc;
    Boolean czs;
    void info() {
        System.out.println("Enter Your Name : ");
        name = sc.next();
        System.out.println("Enter Your Age : ");
        age = sc.nextInt();
        System.out.println("Enter Your Net Monthly Income : ");
        inc = sc.nextDouble();
        System.out.println("Enter Your Total Work Experince : ");
        experience = sc.nextInt();
        System.out.println("What is Your CitizenShip? : ");
        czs = sc.nextBoolean();
    }
    void check() {
        if (age >= 21 && age <= 60) {
            System.out.println("Your Age is : " + age);
        } else if (inc >= 15000) {
            System.out.println("Your Monthly Income is : " + inc);
        } else if (experience >= 1) {
            System.out.println("Your Work Experience is : " + experience);
        } else if (czs == true) {
            System.out.println("You Are A Indian Citizenship");
        }
    }
}
public class Practical_3 extends AccountHolder {

    public static void main(String[] args) {
        int count = 0;
        ArrayList a = new ArrayList<>();
        ArrayList<AccountHolder> personHolder = new ArrayList<AccountHolder>();
        for (int i = 1; i <= 5; i++) {
            personHolder.add(new AccountHolder());
        }
        for (AccountHolder p : personHolder) {
            p.info();
            p.check();
            if (p.age >= 21 && p.age <= 60 && p.inc >= 15000 && p.experience >= 1 && p.czs == true) {
                System.out.println("You are Elligeble**");
                System.out.println("Your Name is : " + p.name);
                count++;
                a.add(p.name);
            } else {
                System.out.println("You Are Not Elligeble!!!");
            }
        }
        System.out.println("The Number of Elligeble Candidates : " + count);
        System.out.println("The Number of Not Elligeble Candidates : " + (5 - count));
        System.out.println("All Eligible Candidates Are : " + a);
    }
}

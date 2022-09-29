//**THIS PROGRAM IS PREPRED BY DIVY_21CE134**
package Part_6;

public class Practical3 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 20; i++) {
            try {
                Thread.sleep(500);     //after 500 ms next number will br print..
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.print(i + " ");
        }
    }
}
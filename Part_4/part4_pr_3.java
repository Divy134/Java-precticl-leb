package JAVA.Part_4;

public class part4_pr_3 {
    public static void main(String[] args) {
        try {   
            throw new ArrayIndexOutOfBoundsException(); //If we can throw ArithmeticException then 1st catch block executated.
        }
        catch(ArithmeticException ex) {     // 1st catch block..
            System.out.println(ex);
        }
        catch(ArrayIndexOutOfBoundsException ex) {   //2nd catch block..
            System.out.println(ex);
        }
        finally {
            System.out.println("Finally Block executed....");
        }
        System.out.println("**THIS PROGRAM IS PREPARED BY DIVY_21CE134**");
    }
}

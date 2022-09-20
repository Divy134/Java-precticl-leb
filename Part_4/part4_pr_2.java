package JAVA.Part_4;

class ThrowException extends Exception {
    public ThrowException(String str1) {
        super(str1);
    }
}

public class part4_pr_2 {
    static void fun() throws ThrowException {
        throw new ThrowException("Throw Custom exception");
    }

    public static void main(String[] args) {
        try {
            fun();
        } catch (ThrowException e) {
            System.out.println("Caught custom exception");
            System.out.println(e);
        }
        System.out.println("**THIS PROGRAM IS PREPARED BY DIVY_21CE134**");
    }
}

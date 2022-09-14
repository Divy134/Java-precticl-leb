package Part_3;

interface TestInterface { // methods in java

    public void square(int a); // abstract method

    default void show() { // default method
        System.out.println("Default Method Executed");
    }
}

public class Practical7 implements TestInterface {
    // implementation of square abstract method
    public void square(int a) {
        System.out.println(a * a);
    }

    public static void main(String args[]) {
        Practical7 d = new Practical7();
        d.square(4);
        d.show(); // default method executed
        System.out.println("**THIS PROGRAM IS PREPARED BY DIVY_21CE134**");
    }
}
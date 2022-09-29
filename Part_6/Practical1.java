//**THIS PROGRAM IS PREPARED BY DIVY_21CE134**
package Part_6;

public class Practical1 {
     public static void main(String[] args) {
        Thread1 obj1 = new Thread1();
        obj1.start();
        Thread obj2 = new Thread(new Thread2());
        obj2.start();
    }
}

class Thread1 extends Thread {
    public void run() {
        System.out.println("Hello world");  //This thread is extending Thread class
    }
}

class Thread2 implements Runnable {
    public void run() {
        System.out.println("Hello world");  //This thread is implementing Runnable interface
    }
}
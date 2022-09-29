//**THIS PROGRAM IS PREPARED BY DIVY_21CE134**
package Part_6;

public class Practical4 {
    public static void main(String[] args) {
        First obj1 = new First();
        obj1.setName("First");

        Second obj2 = new Second();
        obj2.setName("Second");

        Third obj3 = new Third();
        obj3.setName("Third");

        obj1.setPriority(1);
        obj2.setPriority(2);
        obj3.setPriority(3);

        obj1.start();
        obj2.start();
        obj3.start();
    }
}

class First extends Thread {
    public void run() {
        System.out.println("Priority of thread " + Thread.currentThread().getName() + " : "
                + Thread.currentThread().getPriority());
    }
}

class Second extends Thread {
    public void run() {
        System.out.println("Priority of thread " + Thread.currentThread().getName() + " : "
                + Thread.currentThread().getPriority());
    }
}

class Third extends Thread {
    public void run() {
        System.out.println("Priority of thread " + Thread.currentThread().getName() + " : "
                + Thread.currentThread().getPriority());
    }
}
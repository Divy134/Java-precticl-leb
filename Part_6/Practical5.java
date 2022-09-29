//**THIS PROGRAM IS PREPARED BY DIVY_21CE134*

package Part_6;

import java.util.*;

public class Practical5 {
    public static void main(String[] args)
            throws InterruptedException {
        // Object of a class that has both produce() and consume() methods
        final PC pc = new PC();
        Thread t1 = new Thread(new Runnable() {   // Create producer thread
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {   // Create consumer thread
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    // This class has a list, producer (adds items to list and consumer (removes items).
    public static class PC {

        // Create a list shared by producer and consumer
        // Size of list is 2.
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;

        // Function called by producer thread
        public void produce() throws InterruptedException {
            int value = 0;
            while (true) {
                synchronized (this) {
                    // producer thread waits while list
                    // is full
                    while (list.size() == capacity)
                        wait();

                    System.out.println("Producer produced-"+ value);
                    list.add(value++);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
        public void consume() throws InterruptedException {    // Function called by consumer thread
            while (true) {
                synchronized (this) {
                    while (list.size() == 0)
                        wait();
                    int val = list.removeFirst();

                    System.out.println("Consumer consumed-"+ val);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
    }
}
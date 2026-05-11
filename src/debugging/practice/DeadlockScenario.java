package debugging.practice;


interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

class Test implements A, B {


    @Override
    public void show() {
        A.super.show();
    }
}


public class DeadlockScenario {

    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread1 acquired lock1");
            }
            synchronized (lock2) {
                System.out.println("Thread1 acquired lock2");
            }
        });


        Thread t2 = new Thread(() -> {
            synchronized(lock2) {

                System.out.println("Thread2 acquired lock2");

                synchronized(lock1) {
                    System.out.println("Thread2 acquired lock1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

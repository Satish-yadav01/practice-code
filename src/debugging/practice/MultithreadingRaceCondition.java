package debugging.practice;


class Counter2 {

    int count = 0;

    public Counter2(){
        System.out.println("Initialized by Thread: " + Thread.currentThread().getName());
        System.out.println("count = " + count);
    }

    synchronized void increment() {
        count++;
        System.out.println("count : " + count + " > Incremented by Thread: " + Thread.currentThread().getName());

    }
}

public class MultithreadingRaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter2 c = new Counter2();

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 100; i++) {
                c.increment();
            }
        },"Thread-t1");

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 100; i++) {
                c.increment();
            }
        },"Thread-t2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);

        System.out.println("Main thread continues");
    }
}

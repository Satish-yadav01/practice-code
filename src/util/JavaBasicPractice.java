package util;

class Singleton {
    private static int a=10;


    private Singleton() {
        System.out.println("Instance created by: " + Thread.currentThread().getName());
    }

    private static final class InstanceHolder {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        a=20;
        return InstanceHolder.instance;
    }

    public void print(){
        System.out.println("This is Demo!! " + Thread.currentThread().getName());
    }
}

public class JavaBasicPractice {
    public static void main(String[] args) {

//        Runnable task = () -> {
//            Singleton instance = Singleton.getInstance();
//            instance.print();
//        };
//
//        // Create multiple threads
//        for (int i = 0; i < 10; i++) {
//            Thread t = new Thread(task, "Thread-" + i);
//            t.start();
//        }

        A b = new B();
        b.m2();
        b.callM1();

        System.out.println("-------");
        b.callM2();
    }
}

class A{
    private void m1(){
        System.out.println("this is m1 in class A");
    }
    public void callM1(){
        m1();
    }

    protected void m2(){
        System.out.println("this is m2 in class A");
    }

    protected void callM2(){
        m2();
    }
}

class B extends A{
    private void m1(){
        System.out.println("this is m1 in class B");
    }

    protected void m2(){
        super.m2();
        System.out.println("this is m2 in class B");
    }
}
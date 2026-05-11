package debugging.practice;

/*
Questions
Output?
Why shared?
* */

class Counter {
    static int count = 0;

    Counter() {
        count++;
    }
}
public class StaticVsInstanceVariable {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();

        System.out.println(Counter.count);

        String s1 = "hello";
        s1 = "Satish";
        s1.concat("world");

        System.out.println(s1);

        show();

    }

    private static void show() {
        try {
            System.out.println("Try");
            return;
        }
        finally {
            System.out.println("Finally");
        }
    }
}

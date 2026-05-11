package debugging.practice;

/*

Questions
Output?
Is method overriding happening?
Why or why not?

class Parent {
    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void show(int x) {
        System.out.println("Child");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}
* */

//fix

class Parent {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent(){
        System.out.println("this is Parent Constructor");
    }

    public Parent(String name, int age) {
        System.out.println("this is a parent Constructor with name : "+name+" and age: " + age);
        this.name = name;
        this.age = age;
    }

    public Parent(int x){
        System.out.println("this is Parent Constructor x: " + x);
    }
    protected void show() {
        System.out.println("Parent");
    }

    public void m1(){
        System.out.println("method m1");
    }
}

class Child extends Parent {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Child(int x){
        super(); //this is By-Default will not no need to mention it but when we want to change the parameterized constructor then we can use this
        super.show();
        System.out.println("this is Child Constructor");
        show();
    }

    public Child(String parentName, int parentAge, String name){
        super(parentName, parentAge);
        this.name = name;
        System.out.println("this is child constructor with childName :" + name);
    }

    protected void show() {
        System.out.println("Child");
    }

    public void m2(){
        System.out.println("m2 method");
    }
}

public class MethodOverridingVsOverloading {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 11);
//        Parent p = new Child(randomNumber);
        Parent p1 = new Child("Satish", 24, "Abhinav");
        System.out.println("name : " + p1.getName());
        p1.m1();
//        p1.m2();
    }
}

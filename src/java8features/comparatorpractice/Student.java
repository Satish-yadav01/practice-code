package java8features.comparatorpractice;

import java8features.genericpractice.GenericExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private int rollNo;

    public Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNo=" + rollNo +
                '}';
    }
}

class Solution{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Satish", 24, 12),
                new Student("Abhi", 28, 15),
                new Student("Naman", 28, 25)
        ));

        //different ways to use the comparator as this is a functional interface we can directly use the lambda function or method reference.

//        students.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getRollNo() - o2.getRollNo();
//            }
//        });

//        students.sort((s1, s2) -> s1.getRollNo() - s2.getRollNo());

        students.sort(Comparator.comparingInt(Student::getRollNo));

        students.forEach(System.out::println);

    }
}

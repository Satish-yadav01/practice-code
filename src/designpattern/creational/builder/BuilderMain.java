package designpattern.creational.builder;

import java.util.List;

public class BuilderMain {
    public static void main(String[] args) {
        Student satish = new Student.StudentBuilder()
                .age(20)
                .gender("MALE")
                .name("SATISH")
                .build();

        Student abhishek = new Student.StudentBuilder()
                .age(20)
                .gender("MALE")
                .name("ABHISHEK")
                .build();

        Student chandu = new Student.StudentBuilder()
                .age(20)
                .gender("MALE")
                .name("CHANDU")
                .build();

        List<Student> list = List.of(satish, abhishek, chandu);

        System.out.println(list);
        list.forEach(i -> System.out.println(i.getName()+" " + i.getAge()+" "+i.getGender()));

        System.out.println(satish);


    }

}

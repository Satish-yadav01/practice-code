package designpattern.creational.builder;

import java.io.Serializable;

public class Student implements Serializable,Comparable<Student> {
    private String name;
    private int age;
    private String gender;

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return o.getName().compareTo(this.name);
    }

    static class StudentBuilder{
        private String name;
        private int age;
        private String gender;

        public StudentBuilder name(String name){
            this.name = name;
            return this;
        }
        public StudentBuilder age(int age){
            this.age = age;
            return this;
        }
        public StudentBuilder gender(String gender){
            this.gender = gender;
            return this;
        }
        public Student build(){
            return new Student(name, age, gender);
        }

    }
}

package java8features.comparablepractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>{
    private String name;
    private int salary;
    private int age;

    public Employee(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public int compareTo(Employee emp) {
        return this.age - emp.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}

class Solution{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Satish",1000,24);
        Employee emp2 = new Employee("Abhi",2000,25);
        Employee emp3 = new Employee("Abhay",25000,29);

        List<Employee> employees = new ArrayList<>(List.of(emp1, emp2, emp3));

        Collections.sort(employees);
        System.out.println(employees);

        employees.forEach(System.out::println);
    }
}
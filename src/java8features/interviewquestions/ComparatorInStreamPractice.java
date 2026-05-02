package java8features.interviewquestions;

import java8features.comparablepractice.Employee;

import java.util.*;

public class ComparatorInStreamPractice {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Satish",10000, 24),
                new Employee("Bhanu",2000, 25),
                new Employee("Abhishek",2000, 20),
                new Employee("Abhijit",3000, 18),
                new Employee("Ram",5000, 40),
                new Employee("raju",500, 15)
        );

//        👉 Sort employees based on salary.
    employees.stream().sorted(Comparator.comparing(Employee::getSalary))
            .map(Employee::getSalary).forEach(System.out::println);

        System.out.println("2. Sort by salary (descending)\n");

//        2️⃣ Sort by salary (descending)
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(Employee::getSalary).forEach(System.out::println);

        System.out.println("\n3. Sort by name (alphabetical)\n");
        employees.stream().sorted(Comparator.comparing(Employee::getName))
                .map(Employee::getName).forEach(System.out::println);

        System.out.println("\n4. Get highest paid employee\n");
        employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .ifPresentOrElse(System.out::println,
                        () -> new Exception("not found"));

        System.out.println("\n6. Sort by salary, then name\n");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary)
                        .reversed()
                        .thenComparing(Employee::getName))
                .distinct()
                .forEach(System.out::println);

        System.out.println("\n7. Sort by Age, then salary (descending)\n");

        employees.stream()
                .sorted(Comparator.comparing(Employee::getAge)
                        .thenComparing(Employee::getSalary))
                .forEach(System.out::println);

        System.out.println("\n8. Get second highest salary employee\n");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("\n9. Get top 3 highest paid employees \n");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .forEach(System.out::println);


    }
}

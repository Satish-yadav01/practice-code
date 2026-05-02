import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee {

    private String name;
    private double salary;
    private String department;

    // Constructor for salary-based examples
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Constructor for department-based examples
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Full constructor (recommended for real-world usage)
    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    // Setters (optional, based on immutability preference)
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // toString (very useful for debugging & output)
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {
//        Employee satish = new Employee(1, "Satish", 30, List.of("IT", "ADMIN"));
//        Employee abhi = new Employee(2, "Abhi", 15, List.of("IT", "ADMIN","Sales"));
//        Employee Shyam = new Employee(3, "Shaym", 25, List.of("IT", "ADMIN","Sales"));
//
//
//        List<Employee> employees = List.of(satish, abhi, Shyam);
//
//        employees.stream()
//                .sorted(Comparator.comparing(employee -> employee.getAge()))
//                .forEach(e-> System.out.println(e));
//
////        employees.stream()
////                .sorted(Comparator.reverseOrder().thenComparing())
////                .forEach(System.out::println);
//
//
//        //display the employee name and and it's department
//        Map<String,List<String>> map = new HashMap<>();
//        System.out.println("Employee Name and It's Department\n");
//        employees.stream()
//                .forEach(e->{
//                    map.put(e.getName(),e.getDepartment());
//                });
//
//        System.out.println(map);

//        String a = "aasdc";
//        String b = "asdc";
//
//        String concat = a.concat(b);
//        System.out.println(concat);
//        System.out.println(2%2);
//
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//
//        list.stream()
//                .filter(n -> n % 2 == 0)
//                .forEach(System.out::println);

//        find the duplicate elements
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 3,6);
        Set<Integer> set = new HashSet<>();

        Set<Integer> collect = list.stream().filter(n -> !set.add(n))
                .collect(Collectors.toSet());

        System.out.println("collect : " + collect);

//        2. Find first non-repeated character in a string
        String input = "satish";

        Character c1 = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey())
                .findFirst()
                .orElse(null);

        System.out.println("c1 : " + c1);

//        3. Sort employees by salary

        List<Employee> employees = Arrays.asList(
                new Employee("A", 3000),
                new Employee("B", 5000),
                new Employee("C", 4000)
        );

        List<Employee> collect1 = employees.stream()
                .sorted((e1, e2) -> (int) (e1.getSalary() - e2.getSalary()))
                .toList();

        collect1.forEach(System.out::println);

//        4. Highest salary employee
        Employee employee = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);

        System.out.println("employee" + employee);


//        5. Group by department
        List<Employee> empDepart = Arrays.asList(
                new Employee("A", "IT"),
                new Employee("B", "HR"),
                new Employee("C", "IT")
        );

        Map<String, List<Employee>> stringListMap = empDepart.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment
                ));

        stringListMap.forEach((key, value) -> System.out.println(key + value));

//        6. Count occurrences
        List<String> list1 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        list1.stream()
                .collect(Collectors.groupingBy(
                        e -> e,
                        Collectors.counting()
                ))
                .forEach((key, value) -> System.out.println(key +" : "+ value));

        Map<Character, Integer> map = new HashMap<>();
        map.put('A',10);
        map.put('B',20);
        map.put('C',30);
        map.put('D',40);
        map.put('E',5);
        map.put('F',2);

        Map.Entry<Character, Integer> characterIntegerEntry = map.entrySet().stream()
                .max((e1, e2) -> e1.getValue() - e2.getValue())
                .orElse(null);


        System.out.println("character entry : " + characterIntegerEntry);

        List<Character> collect2 = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("collect 2 : " + collect2);





    }
}
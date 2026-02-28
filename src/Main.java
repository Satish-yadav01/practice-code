import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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

        String a = "aasdc";
        String b = "asdc";

        String concat = a.concat(b);
        System.out.println(concat);
        System.out.println(2%2);

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
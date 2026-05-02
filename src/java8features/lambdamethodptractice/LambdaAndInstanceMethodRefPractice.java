package java8features.lambdamethodptractice;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class LambdaAndInstanceMethodRefPractice {
    public static void main(String[] args) {
        //        practice lambda and instance method reference.
//        1.Extract all keys from a Map<Integer, String> into a list.
        Map<Integer, String> map1 = Map.of(1, "A", 2, "B", 3, "C");
        List<Integer> list = map1.entrySet()
                .stream()
                .map(entry -> entry.getKey())
                .sorted(Collections.reverseOrder())
                .toList();

        System.out.println("list : " + list);

//        with instance method reference
        List<Integer> list2 = map1.entrySet()
                .stream()
                .map(Map.Entry::getKey)
                .sorted(Collections.reverseOrder())
                .toList();

        System.out.println("list2 : " + list2);

//         ✅ Example 2 — Particular object method reference (your str::length case)
//        Q2 : Add a fixed prefix "Mr. " to all names in a list.
        List<String> names = List.of("John", "David", "Satish", "Abhishek", "Abhijit");

        String prefix = "Mr. ";

        List<String> list1 = names.stream().map(name -> prefix.concat(name)).toList();
        System.out.println("List1 : " + list1);

        List<String> list3 = names.stream().map(prefix::concat).toList();
        System.out.println("list3 : " + list3);


//        Q3: Convert a list of names to uppercase.
        names.stream().map(String::toUpperCase).forEach(System.out::println);

//        Q4: ✅ Example 4 — Calculate length of each string
        names.stream().map(String::length).forEach(System.out::println);

//        ✅ Example 5 — Filter using a particular object
//        Filter names that start with a given prefix "A".
        names.stream().filter("A"::startsWith).forEach(System.out::println);


    }
}

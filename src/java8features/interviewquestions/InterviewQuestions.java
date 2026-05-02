package java8features.interviewquestions;

import java.util.*;
import java.util.stream.Collectors;

public class InterviewQuestions {
    public static void main(String[] args) {
//        1️⃣ Find max element
        List<Integer> numbers = List.of(1,2,3,4,5,6,99,201,55,4000,55);
        numbers.stream().max(Integer::compareTo).ifPresent(System.out::println);

//        2️⃣ Filter even numbers
        numbers.stream().filter(n -> n%2 == 0).forEach(System.out::println);

//        3️⃣ Convert list of strings to uppercase
        List<String> names = List.of("Satish","Abhishek","Naman","Prabhakar","abhi");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("----------------");
//        👉 Count how many names are present.
        long count = names.stream()
                .map(String::toUpperCase)
                .peek(System.out::println)
                .filter(s -> s.startsWith("A"))
                .count();

        System.out.println("count : " + count);

//        👉 Get the first element safely.
        names.stream().map(String::toUpperCase).filter(s -> s.startsWith("A")).findFirst().ifPresent(System.out::println);

//        7. Given a String, find the first non-repeated character in it using Stream functions?
        String name = "satish";
        name.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);

//        11. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
        int []num = {1,2,3,4,5,4,5,2,8,9};
        Set<Integer> set = new HashSet<>();
        boolean match = Arrays.stream(num).anyMatch(n -> !set.add(n));
        System.out.println("match : " + match);

//        14. Java 8 program to perform cube on list elements and filter numbers greater than 50.
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        integerList.stream().map(n->n*n*n).filter(n-> n > 50).forEach(System.out::println);



    }
}

package java8features.interviewquestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InterviewStreamPractice {
    public static void main(String[] args) {
        System.out.println("1. Filter Even Numbers from a List\n");
        int []numbers = {10,1,2,3,4,5,6,7,8,9};
        Arrays.stream(numbers).boxed().filter(n-> n%2==0).toList().forEach(System.out::println);

        System.out.println("\n2. Find Maximum in a List\n");
        Arrays.stream(numbers).boxed().max(Integer::compare).ifPresent(System.out::println);

        System.out.println("\n3. Sort a List\n");
        Arrays.stream(numbers).boxed().sorted(Collections.reverseOrder()).forEach(System.out::println);

        System.out.println("\nQuestion: Count strings starting with a specific prefix, e.g., “A”.\n");
        List<String> names = Arrays.asList("Alice","Alice","Alice", "Bob", "Annie", "Alex", "Charlie");
        long count = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println("count : " + count);

        names.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toMap(
                        s -> s,
                        s -> 1L,
                        Long::sum
                )).entrySet()
                .forEach(System.out::println);

        System.out.println("\nExample 6: Index Mapping (Common Interview Trick)\n");
        IntStream.range(0, names.size())
                .boxed()
                .collect(Collectors.toMap(
                        names::get,
                        i->i,
                        (ov,nv)->ov
                )).entrySet()
                .forEach(System.out::println);

        System.out.println("\n✅ Example 7: Mapping After Filtering\n");
        names.stream()
                .filter(s->s.startsWith("A"))
                .collect(Collectors.toMap(
                        name -> name,
                        String::length,
                        (ov,nv)->ov
                )).entrySet()
                .forEach(System.out::println);

        System.out.println("\n5. Find First Non-Repeated Character in a String\n");
        String input = "swiss";
        input.chars()
                .mapToObj(c -> (char) c)
                .peek(System.out::println)
                .filter(c -> input.indexOf(c) == input.lastIndexOf(c))
                .findFirst()
                .ifPresentOrElse(System.out::println,
                        ()-> new RuntimeException("Not Found"));

        System.out.println("6. Convert List of Strings to Uppercase\n");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("7. Sum of Numbers in a List\n");
        int sum = Arrays.stream(numbers).sum();
        System.out.println("sum : " + sum);

        List<String> num = List.of("1","2","3","4","5");
        int sum1 = num.stream().mapToInt(Integer::parseInt).sum();
        System.out.println("Sum1 : " + sum1);

        System.out.println("\nQuestion: Check if any string in a list contains “API”.\n");
        List<String> strings = Arrays.asList("Java", "Stream API", "Lambda");
        boolean match = strings.stream().anyMatch(s -> s.contains("API"));
        System.out.println("match : " + match);



    }
}

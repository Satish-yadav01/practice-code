package java8features.lambdamethodptractice;

import java.util.*;

public class LambdaAndStaticMethodRefPractice {
    public static void main(String[] args) {
//      Q1:  Convert a list of numeric strings into integers.
        List<String> list = List.of("1", "2", "3");
        list.stream().map(Integer::parseInt).forEach(System.out::println);

//        Find the maximum number from a list.
        List<Integer> list2 = List.of(10, 20, 5);
        list2.stream().max(Integer::compareTo).ifPresent(System.out::println);

//      Sort strings ignoring case.
        List<String> names = List.of("Naman","Satish", "Abhishek", "Akshay");
        names.stream().sorted(String::compareToIgnoreCase).forEach(System.out::println);


    }
}

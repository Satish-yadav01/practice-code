package questionss;


import java.util.ArrayList;
import java.util.Collections;

public class BiggestNumner {

    // Custom comparator to compare concatenated strings
    static boolean myCompare(String s1, String s2) {
        return (s1 + s2).compareTo(s2 + s1) > 0;
    }

    // Function to return the largest concatenated number
    static String findLargest(int[] arr) {

        // Convert the array of integers to an array of strings
        ArrayList<String> numbers = new ArrayList<>();
        for (int ele : arr) {
            numbers.add(Integer.toString(ele));
        }

        // Sort the array using the custom comparator
        Collections.sort(numbers, (s1, s2) -> myCompare(s1, s2) ? -1 : 1);

        // Handle the case where all numbers are zero.
        // We are sorting in descending order, so zero
        // in front means complete array contains zero
        if (numbers.get(0).equals("0")) {
            return "0";
        }

        // Concatenate the sorted array
        StringBuilder res = new StringBuilder();
        for (String num : numbers) {
            res.append(num);
        }

        return res.toString();
    }

    public static void main(String[] args) {
        int[] arr = { 3, 30, 34, 5, 9 };
//        System.out.println(findLargest(arr));

        System.out.println("30".compareTo("30"));
        System.out.println("33".compareTo("36"));
        System.out.println("60".compareTo("30"));
        System.out.println("66".compareTo("30"));
        System.out.println("72".compareTo("70"));
        System.out.println("300".compareTo("3"));

        System.out.println("--------------------");
        System.out.println((int)'0');
        System.out.println((int)'1');
        System.out.println((int)'2');
        System.out.println((int)'3');
        System.out.println((int)'4');
        System.out.println((int)'5');
        System.out.println((int)'6');
        System.out.println((int)'7');
        System.out.println((int)'8');
        System.out.println((int)'9');

    }
}

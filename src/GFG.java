// Fibonacci series program in java

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GFG {
    // Function to print N Fibonacci Number
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            // Print the number
            System.out.print(num1 + " ");

            if(map.containsKey(i)){

            }

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;

            if(!map.containsKey(i)){
                map.put(i,num3);
            }
        }
    }

    // Driver Code
    public static void main(String args[])
    {
//        // Given Number N
//        int N = 10000;
//
//        // Function Call
//        Fibonacci(N);

//        int a[] = {1,4,2,6,7,8,10,5,4,13};
//
//        List<Integer> leaders = new ArrayList<>();
//        for(int i=0; i<=a.length-2; i++){
//            if(a[i] > a[i+1]){
//                leaders.add(a[i]);
//            }
//        }
//        leaders.add(a[a.length-1]);
//
//        System.out.println(leaders);


        String s = "aa_aAAS_Vcs_xzs";

        //aaAAASVcsXzs

//        System.out.println((int)'a');  //97 - 122
//        System.out.println((int)'z');
//        System.out.println((int)'A');  //65 - 90
//        System.out.println((int)'Z');

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<=s.length()-2; i++){
            if(s.charAt(i) == '_'){
                if(97 <= s.charAt(i+1) && 122 >= s.charAt(i+1)){
                    sb.append((s.charAt(i+1)+"").toUpperCase());
                    i++;
                }
            }else{
                sb.append((s.charAt(i)+""));
            }
        }

        sb.append(s.charAt(sb.length()-1));

        System.out.println(sb.toString());




//        for(char ch  : s.toCharArray()){
//            if(97 <= (int)ch && (int)ch <= 122){
//                sb.append((ch + "").toUpperCase());
//            } else if (65 <= (int)ch && (int)ch <= 90) {
//                sb.append((ch + "").toLowerCase());
//            }
//        }
//
//        System.out.println(sb.toString());

    }


}
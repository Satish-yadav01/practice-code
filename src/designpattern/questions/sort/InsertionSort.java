package designpattern.questions.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int []a = {4,2,6,3,1,9,7,8,3,5,7};
        for(int i=1; i<=a.length-1;i++){
            int j=i;
            while(j>0 && a[j-1]> a[j]){
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                j--;
            }
        }


        System.out.println("sorted array : " + Arrays.toString(a));
    }
}

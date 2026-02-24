package designpattern.questions;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int []a = {-5,4,3,2,1,1,1};
        int k=5;
        Arrays.sort(a);  //-4,1,2,3,5
        int[] result = new int[3];
        for(int i=0;i<a.length;i++){
            result = twoSum(a, i, k);
        }

        System.out.println("result : " + Arrays.toString(result));
    }

    public static int[] twoSum(int[] a, int i, int k) {
        int left=i+1,right=a.length-1;
        int result[] = new int[3];
        while(left<right){
            int sum = a[i] + a[left] + a[right];
            if(sum==k){
                System.out.println( a[i] +" "+ a[left] +" "+ a[right]);
                result[0] = a[i];
                result[1] = a[left];
                result[2] = a[right];
                return result;
            }
            if(sum<k){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1,-1};
    }
}

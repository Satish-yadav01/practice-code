package designpattern.questions;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int []a = {1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int l=0,r=0,maxLength=0,zero=0;
        while(r<a.length){
            if(a[r]==0) zero++;

            while (zero > k) {
                if (a[l] == 0) zero--;
                l++;
            }

            int length = r - l + 1;
            maxLength=Math.max(maxLength,length);

            r++;
        }

        System.out.println("MaxLength : " + maxLength);
    }
}

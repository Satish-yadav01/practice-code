package designpattern.questions;

import java.util.Arrays;

public class LongestSequence {
    public static void main(String[] args) {
        String s="zxyzxabcaa";

        int l=0,r=0,maxlength=0;
        int []hash = new int[256];
        Arrays.fill(hash,-1);
        while(r<s.length()){
            if(hash[s.charAt(r)]!=-1){
                l = hash[s.charAt(r)]+1;
            }
            int length = r-l+1;
            maxlength = Math.max(length,maxlength);
            hash[s.charAt(r)]=r;
            r++;
        }

        System.out.println("maxLength : " + maxlength);
    }
}

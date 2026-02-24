package designpattern.questions;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int []nums = {1,2,2,3,3,3,4,5,5,6,7,8,8};
        int slow = 1;
        System.out.println("a : " + Arrays.toString(nums));
        for(int fast = 1; fast <= nums.length-1; fast++) {
            if(nums[fast] != nums[fast-1]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }

        System.out.println("a : " + Arrays.toString(nums) + "slow : " + slow);

    }
}

package leetcode.practice.leetcode75;

import java.util.Arrays;

// 1480. Running Sum of 1d Array
// https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSumArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int[] sumArray = runningSum(nums);
        System.out.println(Arrays.toString(sumArray));
    }

    public static int[] runningSum(int[] nums) {
        int[] sumArray = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            sumArray[i] = sum;
        }
        return sumArray;
    }
}

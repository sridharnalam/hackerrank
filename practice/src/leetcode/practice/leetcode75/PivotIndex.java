package leetcode.practice.leetcode75;

// 724. Find Pivot Index
// https://leetcode.com/problems/find-pivot-index/
public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
//        int[] nums = {1, 2, 3};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {

        int leftSum = 0;
        int sum = 0;
        for (int val : nums) {
            sum += val;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - nums[i] - leftSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}

package leetcode.practice.datastructures;

// 53. Maximum Subarray
public class MaximumSubArray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public static int maxSubArray(int[] nums) {
        return sumOfSubArray(nums, 0, nums.length - 1);
    }

    public static int sumOfSubArray(int[] nums, int a, int z) {
        if (a > z) {
            return Integer.MIN_VALUE;
        }
        if (a == z) {
            return nums[a];
        }
        int mid = (a + z) / 2;
        return Math.max(Math.max(sumOfSubArray(nums, a, mid - 1), sumOfSubArray(nums, mid + 1, z)),
                sumOfCross(nums, a, mid, z));
    }

    public static int sumOfCross(int[] nums, int a, int m, int z) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = m; i >= a; i--) {
            sum += nums[i];
            if (sum > leftSum) {
                leftSum = sum;
            }
        }
        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = m; i <= z; i++) {
            sum += nums[i];
            if(sum > rightSum) {
                rightSum = sum;
            }
        }
        return Math.max(
                Math.max(leftSum, rightSum),
                leftSum+rightSum-nums[m]
        );
    }
}

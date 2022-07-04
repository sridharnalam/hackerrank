package leetcode.practice.leetcode75;

// https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
//        System.out.println(Arrays.toString(twoSum(nums, 6)));
        System.out.println(checkRecord("AAAA"));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] + first == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

    public static boolean checkRecord(String s) {
        if(s.contains("LLL")) {
            return false;
        }
        if(s.split("A").length>2) {
            return false;
        }
        return true;
    }

}

package leetcode.practice.problems;

// 334. Increasing Triplet Subsequence
public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
//        System.out.println(increasingTriplet(new int[]{5, 4, 3, 2, 1}));
        System.out.println(increasingTriplet(new int[]{2,1,5,0,4,6}));
    }

    public static boolean increasingTriplet(int[] nums) {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for(int n : nums) {
            if(n <= max1) max1 = n;
            else if(n <= max2) max2 = n;
            else return true;
        }
        return false;
    }
}

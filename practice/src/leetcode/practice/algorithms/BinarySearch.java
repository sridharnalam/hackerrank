package leetcode.practice.algorithms;

public class BinarySearch {
    public static void main(String[] args) {
//        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 2));
    }

    public static int search(int[] nums, int target) {
        int index = -1;
        int top = nums.length;
        int bottom = 0;
        int offset = top /2;
        while (bottom<top && offset>=bottom || offset<top) {
            int offsetVal = nums[offset];
            if (offsetVal == target) {
                index = offset;
                break;
            } else if (offsetVal < target) {
                bottom = offset+1;
                offset = bottom+(top-bottom)/2;
            } else {
                top = offset;
                offset = bottom+(top-bottom)/2;
            }
        }
        return index;
    }
}

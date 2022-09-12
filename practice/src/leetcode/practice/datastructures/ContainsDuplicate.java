package leetcode.practice.datastructures;

import java.util.HashMap;
import java.util.Map;

// 217. Contains Duplicate
public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
            if (map.get(num) != null) {
                return true;
            } else {
                map.put(num, true);
            }
        }
        return false;
    }
}

package leetcode.practice.leetcode75;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
        System.out.println(longestPalindrome("a"));
    }

    public static int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char key: s.toCharArray()) {
            map.merge(key, 1, Integer::sum);
        }
        int length = 0;
        for (Character ch : map.keySet()) {
            length += (map.get(ch) - (map.get(ch) % 2));
            if (length %2 == 0) {
                length += map.get(ch) % 2;
            }
        }
        return length;
    }

    public static int longestPalindrome1(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }
}

package leetcode.practice.problems;

import java.util.Iterator;
import java.util.LinkedHashSet;

// 3. Longest Substring Without Repeating Characters
public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int longest = 0;
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                Iterator<Character> iterator = set.iterator();
                Character next = iterator.next();
                while (!next.equals(ch)){
                    iterator.remove();
                    next = iterator.next();
                }
                iterator.remove();
            }
            if (!set.contains(ch)) {
                set.add(ch);
                if (longest < set.size()) {
                    longest = set.size();
                }
            }
        }

        return longest;
    }
}

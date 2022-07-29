package leetcode.practice.dailychallenge;

import java.util.HashMap;
import java.util.Map;

public class MatchingSubsequences {
    public static void main(String[] args) {
        System.out.println(numMatchingSubseq("abcde", new String[]{"a", "bb", "acd", "ace"}));
    }

    // 792. Number of Matching Subsequences
    public static int numMatchingSubseq(String s, String[] words) {
        int res = 0;
        Map<String, Integer> wordsToCount = new HashMap<>();

        for (String word : words) {
            wordsToCount.merge(word, 1, Integer::sum);
        }

        for (String word : wordsToCount.keySet()) {
            if (isSubSequence(s, word)) {
                res += wordsToCount.get(word);
            }
        }

        return res;
    }

   static boolean isSubSequence(String s, String word) {
        int m = s.length();
        int n = word.length();
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (s.charAt(i) == word.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == n;
    }
}

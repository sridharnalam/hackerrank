package leetcode.practice.leetcode75;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
//        System.out.println(isIsomorphic("title", "paper"));
        System.out.println(isIsomorphic("badc", "baba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == null && map2.get(t.charAt(i)) == null) {
                map.put(s.charAt(i), t.charAt(i));
                map2.put(t.charAt(i), s.charAt(i));
            } else if (!((t.charAt(i) == map.get(s.charAt(i))) && (map2.get(t.charAt(i)) == s.charAt(i)))) {
                return false;
            }
        }
        if (map.keySet().size() != map2.keySet().size()) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(map.get(s.charAt(i)));
        }
        return t.equals(stringBuilder.toString());
    }
}

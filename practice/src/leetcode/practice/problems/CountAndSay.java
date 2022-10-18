package leetcode.practice.problems;

import java.util.LinkedHashMap;

// 38. Count and Say
public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(6));
    }

    public static String countAndSay(int n) {
        StringBuilder str = new StringBuilder("1");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        String prev = null;
        for (int counter = 2; counter <= n; counter++) {
            prev = null;
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                String digit = str.substring(i,i+1);
                if (map.get(digit) != null) {
                    int count = map.get(digit) + 1;
                    map.put(digit, count);
                } else {
                    if(prev!=null) {
                        s.append(map.get(prev)).append(prev);
                        map.clear();
                    }
                    map.put(digit, 1);
                    prev = digit;
                }
            }
            if(prev!=null) {
                s.append(map.get(prev)).append(prev);
                map.clear();
            }
            str = s;
        }
        return str.toString();
    }
}

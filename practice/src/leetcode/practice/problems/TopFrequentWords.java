package leetcode.practice.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 692. Top K Frequent Words
public class TopFrequentWords {
    public static void main(String[] args) {
        System.out.println(topKFrequent(new String[]{"A", "B", "C", "C", "D", "E", "C", "D", "A", "B"}, 4));
    }

    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            map.merge(s,1, Integer::sum);
        }
        List<String> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> {
            if (map.get(o1).equals(map.get(o2))) {
                return o1.compareTo(o2);
            } else {
                return map.get(o2) - map.get(o1);
            }
        });
        return list.subList(0, k);
    }
}

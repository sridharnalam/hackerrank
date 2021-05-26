package hackerrank.practice.algorithms;

import java.util.Arrays;
import java.util.List;

public class SubarrayDivision {
    public static void main(String[] args) {
        System.out.println(birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2));
    }

    public static int birthday(List<Integer> s, int d, int m) { // s: numbers on the chocolate, d: day and m: month
        int noOfWays = 0; // The number of ways the bar can be divided
        if (s.size() < m) {
            return noOfWays;
        }
        for (int i = 0; i < s.size(); i++) {
            if (i + m <= s.size()) {
                int total = 0;
                for (int number : s.subList(i, i + m)) {
                    total += number;
                }
                if (total == d) {
                    noOfWays++;
                }
            } else {
                break;
            }
        }
        return noOfWays;
    }
}

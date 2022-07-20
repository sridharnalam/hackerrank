package leetcode.practice.dailychallenge;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        System.out.println(generate(15).toString());
    }

    // (x + y)n = nC0 xny0 + nC1 xn-1y1 + nC2 xn-2 y2 + ... + nCk xn-kyk +....+ nCn x0yn
    // ncr = n!/r!(n–r)!
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int r = 0; r <= i; r++) {
                int combinationOfR = getCombinationOf(i, r);
                row.add(combinationOfR);
            }
            pascal.add(row);
        }
        return pascal;
    }

    private static int getCombinationOf(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        }
        int lowerBound = Math.max(r, n - r);
        long top = 1;
        for (int i = n; i > lowerBound; i--) {
            top *=i;
        }
        if(lowerBound == r){
            return (int) (top / factorial(n - r));
        } else {
            return (int) (top / factorial(r));
        }
    }

    private static long factorial(long n) {
        if (n == 1) {
            return 1L;
        }
        return n * factorial(n - 1);
    }
}

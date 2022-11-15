package dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(40));
    }

    static Map<Integer, Integer> cache = new HashMap<>();

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (cache.get(n) != null) {
            return cache.get(n);
        }
        int res =  fibonacci(n - 1) + fibonacci(n - 2);
        cache.put(n, res);
        return res;
    }
}

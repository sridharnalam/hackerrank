package hackerrank.practice.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        System.out.println(Arrays.stream(ar).map(count -> count / 2).sum());
        Map<Integer, Integer> map= new HashMap<>();
        for(int i =0; i<n;i++) {
            if(map.get(ar[i])!=null) {
                map.put(ar[i], map.get(ar[i])+1);
            } else {
                map.put(ar[i], 1);
            }
        }
        int count =0;
        for(Integer key: map.keySet()) {
            int pairs = map.get(key) / 2;
            count = count+ pairs;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] ar = {10,20 ,20 ,10, 10, 30, 50, 10, 20};
        int result = sockMerchant(9, ar);
        System.out.println("Result: "+result);
    }
}
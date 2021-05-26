package hackerrank.practice.arrays;

import java.util.HashMap;
import java.util.Map;

public class MinimumSwapsTwo {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 6, 7};
        System.out.println(minimumSwaps(arr));
    }

    static int minimumSwaps(int[] arr) {
        int[] sequence = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sequence[i] = i + 1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        int swaps = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != sequence[i]) {
                int index = map.get(sequence[i]);
                int temp = arr[i];
                arr[i] = arr[index];
                map.put(arr[i], i);
                arr[index] = temp;
                map.put(arr[index], index);
                swaps++;
//                System.out.println(Arrays.toString(arr)+" "+swaps);
            }
        }
        return swaps;
    }
}

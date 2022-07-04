package datastructures.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = new int[]{17, 45, 2, 9, 30};
        list = sortByInsertionSort(list);
        System.out.println("sorted list : " + Arrays.toString(list));
    }

    private static int[] sortByInsertionSort(int[] list) {
        int n = list.length;
        for (int i = 1; i < n; i++) {
            int key = list[i];
            int j = i - 1;
            for (; j >= 0 && list[j] > key; j--) {
                    list[j+1] = list[j];
            }
            list[j+1] = key;
        }
        return list;
    }
}

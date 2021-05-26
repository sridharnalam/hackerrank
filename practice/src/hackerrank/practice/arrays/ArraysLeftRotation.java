package hackerrank.practice.arrays;

import java.util.Arrays;

public class ArraysLeftRotation {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(rotLeft(a, 2)));
    }

    static int[] rotLeft(int[] a, int d) {
        int[] rotatedArray = new int[a.length];
        for(int i=0; i<a.length;i++ ){
            rotatedArray[i] = a[(d+i)%a.length];
        }
        return rotatedArray;
    }
}

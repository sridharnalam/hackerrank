package hackerrank.practice.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularArrayRotation {
    public static void main(String[] args) {
        System.out.println(circularArrayRotation(Arrays.asList(1,2,3), 2, Arrays.asList(0,1,2)));
    }

    // https://www.hackerrank.com/challenges/circular-array-rotation/problem
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        int[] rotatedList = new int[a.size()];
        for(int i=0;i<a.size();i++){
            int shiftLocation = (i+k) % a.size();
            int current = a.get(i);
            rotatedList[shiftLocation] = current;
        }
        List<Integer> result = new ArrayList<>(3);
        for(Integer position: queries){
            result.add(rotatedList[position]);
        }
        return result;
    }
}

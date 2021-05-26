package hackerrank.practice.algorithms;

import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {
    public static void main(String[] args) {
        System.out.println(getTotalX(Arrays.asList(2,4), Arrays.asList(16, 32, 96)));
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int count =0;
        int factorMaxRange = b.get(0);
        for (int i = 1; i < b.size(); i++) {
            if (b.get(i) < factorMaxRange) {
                factorMaxRange = b.get(i);
            }
        }
        int factorMinRange = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i) > factorMinRange) {
                factorMinRange = a.get(i);
            }
        }
        for(int factor = factorMinRange; factor<=factorMaxRange; factor++){
            boolean isFactor = true;
            for(int number: a) {
                if(factor%number!=0){
                    isFactor = false;
                    break;
                }
            }
            if(!isFactor){
                continue;
            }
            for(int number: b){
                if(number%factor!=0){
                    isFactor = false;
                    break;
                }
            }
            if(isFactor){
                count++;
            }
        }

       return count;
    }
}

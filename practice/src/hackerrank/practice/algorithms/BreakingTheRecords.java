package hackerrank.practice.algorithms;

import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {
    public static void main(String[] args) {
        List<Integer> breakingRecords = breakingRecords(Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42));
        System.out.printf("Best scores : %d, Least scores : %d%n", breakingRecords.get(0), breakingRecords.get(1));
    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int minScore = scores.get(0);
        int maxScore = scores.get(0);
        int lowestRecords =0;
        int highestRecords =0;

        for(int index =1; index<scores.size();index++){
            if(maxScore<scores.get(index)){
                maxScore = scores.get(index);
                highestRecords++;
            } else if(minScore>scores.get(index)){
                minScore = scores.get(index);
                lowestRecords++;
            }
        }
        return Arrays.asList(highestRecords, lowestRecords);
    }
}

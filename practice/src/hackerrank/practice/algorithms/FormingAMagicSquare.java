package hackerrank.practice.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormingAMagicSquare {

    public static void main(String[] args) {
        List<List<Integer>> s = new ArrayList<>();
        s.add(Arrays.asList(5,3,4));
        s.add(Arrays.asList(1,5,8));
        s.add(Arrays.asList(6,4,2));
        System.out.println(formingMagicSquare(s));
    }

    public static int formingMagicSquare(List<List<Integer>> s) {
        int[][][] magicSet = new int[][][]{
                {{4,9,2},{3,5,7},{8,1,6}},
                {{4,3,8},{9,5,1},{2,7,6}},
                {{2,9,4},{7,5,3},{6,1,8}},
                {{2,7,6},{9,5,1},{4,3,8}},
                {{8,1,6},{3,5,7},{4,9,2}},
                {{8,3,4},{1,5,9},{6,7,2}},
                {{6,7,2},{1,5,9},{8,3,4}},
                {{6,1,8},{7,5,3},{2,9,4}}
        };

        int minimumCost =-1;
        for(int i=0;i<magicSet.length;i++){
            int cost =0;
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++) {
                    cost+=Math.abs(magicSet[i][j][k]-s.get(j).get(k));
                }
            }
            if(minimumCost==-1 || minimumCost>cost){
                minimumCost = cost;
            }
        }
        return minimumCost;
    }
}

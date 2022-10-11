package leetcode.weeklycontest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatchingPlayersWithTrainers {

    public static void main(String[] args) {
        System.out.println(matchPlayersAndTrainers(new int[]{4, 7, 9}, new int[]{8, 2, 5, 8}));
    }


    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        List<Integer> playerList = Arrays.stream(players).boxed().sorted().collect(Collectors.toList());
        List<Integer> trainerList = Arrays.stream(trainers).boxed().sorted().collect(Collectors.toList());
        int count = 0;
        int offset = 0;
        for (Integer player : playerList) {
            for (int j = offset; j < trainerList.size(); j++) {
                if (player <= trainerList.get(j)) {
                    offset = j + 1;
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}

package hackerrank.practice.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CavityMap {

    public static void main(String[] args) {
//        System.out.println(cavityMap(Arrays.asList("111236", "191287", "189299", "123498", "189292", "123491")));

        System.out.println(cavityMap(Arrays.asList("179443854",
                "961621369",
                "164139922",
                "968633951",
                "812882578",
                "257829163",
                "812438597",
                "176656233",
                "485773814")));
    }

    public static List<String> cavityMap(List<String> grid) {
        List<String> result = new ArrayList<>();
        if (grid.size() <= 2) {
            return grid;
        }
        result.add(grid.get(0));
        for (int rowIndex = 1; rowIndex < grid.size() - 1; rowIndex++) {
            String topRow = grid.get(rowIndex - 1);
            String row = grid.get(rowIndex);
            String bottomRow = grid.get(rowIndex + 1);
            StringBuilder resultRow = new StringBuilder(row);
            for (int column = 1; column < row.length() - 1; column++) {
                int left = Character.getNumericValue(row.charAt(column - 1));
                int right = Character.getNumericValue(row.charAt(column + 1));
                int top = Character.getNumericValue(topRow.charAt(column));
                int bottom = Character.getNumericValue(bottomRow.charAt(column));
                int current = Character.getNumericValue(row.charAt(column));
                if (current > left && current > right && current > top && current > bottom) {
                    resultRow.setCharAt(column, 'X');
                }
            }
            result.add(resultRow.toString());
        }
        result.add(grid.get(grid.size() - 1));
        return result;
    }
}


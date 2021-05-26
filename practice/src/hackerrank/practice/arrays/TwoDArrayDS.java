package hackerrank.practice.arrays;

public class TwoDArrayDS {
    public static void main(String[] args) {
        /*int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}}; */
        int[][] arr = {
                {-1, -1, 0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5}};
        System.out.println(hourglassSum(arr));
    }

    static int hourglassSum(int[][] arr) {
        Integer largestSum = null;
        for (int row = 0; row < arr.length - 2; row++) {
            for (int column = 0; column < arr[row].length - 2; column++) {
                int hourGlassSum =
                        arr[row][column] + arr[row][column + 1] + arr[row][column + 2]
                                + arr[row + 1][column + 1]
                                + arr[row + 2][column] + arr[row + 2][column + 1] + arr[row + 2][column + 2];
                if(largestSum!=null) {
                    largestSum = Math.max(largestSum, hourGlassSum);
                } else {
                    largestSum = hourGlassSum;
                }
            }
        }
        return largestSum;
    }
}

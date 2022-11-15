package leetcode.practice.dailychallenge;

// 766. Toeplitz Matrix
public class ToeplitzMatrix {
    public static void main(String[] args) {
        System.out.println("Is Toeplitz Matrix " + isToeplitzMatrix(new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}}));
        System.out.println("Is Toeplitz Matrix " + isToeplitzMatrix(new int[][]{{11, 62, 7, 94}, {40, 11, 62, 7}}));
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int r = 0; r < m; r++) {
            int key = matrix[r][0];
            int i = r + 1;
            for (int c = 1; c < n & i < m; c++, i++) {
                if (key != matrix[i][c]) {
                    return false;
                }
            }
        }
        for (int c = 1; c < n; c++) {
            int key = matrix[0][c];
            int i = c + 1;
            for (int r = 1; r < m & i < n; r++, i++) {
                if (key != matrix[r][i]) {
                    return false;
                }
            }
        }

        return true;
    }
}

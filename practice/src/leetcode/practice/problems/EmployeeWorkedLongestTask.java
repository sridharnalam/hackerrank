package leetcode.practice.problems;

// 2432. The Employee That Worked on the Longest Task
public class EmployeeWorkedLongestTask {
    public static void main(String[] args) {
        int[][] input = new int[][]{{0, 3}, {2, 5}, {0, 9}, {1, 15}};
        System.out.println(hardestWorker(10, input));
    }

    public static int hardestWorker(int n, int[][] logs) {
        int[] bigLog = new int[]{0,0};
        int big = 0;
        int value = 0;
        for (int i = 0; i < logs.length; i++) {
            int[] log = logs[i];
            int diff = log[1] - value;
            if (big < diff) {
                bigLog = log;
                big = diff;
            } else if (big == diff && bigLog[0] > log[0]) {
                bigLog = log;
            }
            value = log[1];
        }
        return bigLog[0];
    }
}

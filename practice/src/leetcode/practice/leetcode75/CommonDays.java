package leetcode.practice.leetcode75;

public class CommonDays {
    public static void main(String[] args) {
//        System.out.println(countDaysTogether("08-15", "08-18", "08-16", "08-19"));
        System.out.println(countDaysTogether("10-20", "12-22", "06-21", "07-05"));
    }

    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int aliceLeaveMonth = Integer.parseInt(leaveAlice.substring(0, 2));
        int aliceLeaveDate = Integer.parseInt(leaveAlice.substring(3));
        int aliceArriveMonth = Integer.parseInt(arriveAlice.substring(0, 2));
        int aliceArriveDate = Integer.parseInt(arriveAlice.substring(3));
        int bobArriveMonth = Integer.parseInt(arriveBob.substring(0, 2));
        int bobArriveDate = Integer.parseInt(arriveBob.substring(3));
        int bobLeaveMonth = Integer.parseInt(leaveBob.substring(0, 2));
        int bobLeaveDate = Integer.parseInt(leaveBob.substring(3));

        int aliceArrive = aliceArriveDate;
        for (int i = 0; i < aliceArriveMonth - 1; i++) {
            aliceArrive += days[i];
        }
        int aliceLeave = aliceLeaveDate;
        for (int i = 0; i < aliceLeaveMonth - 1; i++) {
            aliceLeave += days[i];
        }

        int bobArrive = bobArriveDate;
        for (int i = 0; i < bobArriveMonth - 1; i++) {
            bobArrive += days[i];
        }
        int bobLeave = bobLeaveDate;
        for (int i = 0; i < bobLeaveMonth - 1; i++) {
            bobLeave += days[i];
        }
        if (aliceArrive <= bobArrive) {
            if (aliceLeave <= bobLeave && aliceLeave >= bobArrive) {
                return aliceLeave - bobArrive + 1;
            } else if (bobLeave < aliceLeave) {
                return bobLeave - bobArrive + 1;
            }
        } else if (bobArrive < aliceArrive) {
            if (aliceLeave < bobLeave) {
                return aliceLeave - aliceArrive + 1;
            } else if (bobLeave < aliceLeave && bobLeave > aliceArrive) {
                return bobLeave - aliceArrive + 1;
            }
        }
        return 0;
    }
}

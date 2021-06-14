package hackerrank.practice.algorithms;

public class StrangeCounter {

    public static void main(String[] args) {
        System.out.println(strangeCounter(37));
    }

    public static long strangeCounter(long seconds) {
        long range=3;
        while (seconds>range){
            seconds = seconds - range;
            range = range*2;
        }
        return range-seconds+1;
    }
}

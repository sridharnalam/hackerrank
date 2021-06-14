package hackerrank.practice.algorithms;

public class StrangeCounter {

    public static void main(String[] args) {
        System.out.println(strangeCounter(37));
    }

    public static long strangeCounter(long t) {
        long reminder =t;
        long cycle=3;
        while (reminder>cycle){
            reminder = reminder - cycle;
            cycle = cycle*2;
        }
        return cycle-reminder+1;
    }
}

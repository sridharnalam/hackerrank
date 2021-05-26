package hackerrank.practice.warmup;

import java.util.stream.Stream;

public class RepeatedString {
    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 3));
    }

    public static long repeatedString(String s, long n) {
        long count = 0;
        if(!s.contains("a")){
            return count;
        }
        if(s.length()<=n) {
            long occurrenceInWord = Stream.of(s.split("")).filter(alphabet -> alphabet.equalsIgnoreCase("a")).count();
            long multiplier = n / s.length();
            count = occurrenceInWord*multiplier;
        }
        long offset = n%s.length();
        long occurrenceFromOffset = Stream.of(s.substring(0, (int) offset).split("")).filter(alphabet -> alphabet.equalsIgnoreCase("a")).count();
        count = count+occurrenceFromOffset;
        return count;
    }
}

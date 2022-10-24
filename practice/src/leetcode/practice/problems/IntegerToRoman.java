package leetcode.practice.problems;

import java.util.HashMap;
import java.util.Map;

// 12. Integer to Roman
public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }

    public static String intToRoman(int num) {
        //  I =1, V = 5, X = 10,, L = 50, C = 100, D = 500, M = 1000
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(6, "VI");
        map.put(7, "VII");
        map.put(8, "VIII");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(20, "XX");
        map.put(30, "XXX");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(60, "LX");
        map.put(70, "LXX");
        map.put(80, "LXXX");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(200, "CC");
        map.put(300, "CCC");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(600, "DC");
        map.put(700, "DCC");
        map.put(800, "DCCC");
        map.put(900, "CM");
        map.put(1000, "M");
        map.put(2000, "MM");
        map.put(3000, "MMM");

        int dev = 10;
        int rem = 0;
        StringBuilder roman = new StringBuilder();
        while (num != 0) {
            rem = num % dev;
            num -= rem;
            dev *= 10;
            if (rem != 0) {
                roman.insert(0, map.get(rem));
            }
        }
        return roman.toString();
    }

}

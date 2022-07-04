package geeksforgeeks.practice.arrays;

public class SumOfTwoBinaryNumbers {
    public static void main(String[] args) {
        int c = getSum(19, 5);
        System.out.println(c);
    }

    private static int getSum(int a, int b) {
        while(b!=0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }


}

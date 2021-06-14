package hackerrank.practice.algorithms;

public class ModifiedKaprekarNumbers {
    public static void main(String[] args) {
        kaprekarNumbers(1, 100000);
//        kaprekarNumbers(99, 100);
//        kaprekarNumbers(1, 100);
//        kaprekarNumbers(297, 300);
    }

    public static void kaprekarNumbers(int p, int q) {
        StringBuilder result = new StringBuilder();
        for (int i = p; i <= q; i++) {
            if (isKaprekarNumber(i)) {
                result.append(i).append(" ");
            }
        }
        System.out.print(result.toString().trim().length()==0 ? "INVALID RANGE": result.toString());
    }

    private static boolean isKaprekarNumber(long num) {
        String square = (num * num) + "";
        int firstHalfLength = square.length() / 2;
        int firstHalf = (square.length() == 1) ? 0 : Integer.parseInt(square.substring(0, firstHalfLength));
        int secondHalf = Integer.parseInt((square.length() == 1) ? square : square.substring(firstHalfLength));
        return num == (firstHalf + secondHalf);
    }
}

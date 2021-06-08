package hackerrank.practice.algorithms;

public class SherlockAndSquares {
    public static void main(String[] args) {
        System.out.println(squares(100,1000));
    }

    public static int squares(int a, int b) {
        int i,j;
        for(i=1;i*i<a;i++);
        for(j=i;j*j<=b;j++);
        return j-i;
    }
}

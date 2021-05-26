package hackerrank.practice.warmup;

import java.util.Arrays;
import java.util.List;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
//        System.out.println("Jumps : "+ jumpingOnClouds(Arrays.asList(0,0,1,0,0,1,0)));
//        System.out.println("Jumps : "+ jumpingOnClouds(Arrays.asList(0,1,0,0,0,1,0)));
        System.out.println("Jumps : "+ jumpingOnClouds(Arrays.asList(0,0,0,0,1,0)));
    }

    public static int jumpingOnClouds(List<Integer> c) {
        int i =0;
        int jumps = 0;
        while (i<c.size()-1) {
            if(i+2<c.size() && c.get(i+2)==0) {
                i+=2;
            } else {
                i++;
            }
            jumps+=1;
        }
        return jumps;
    }
}

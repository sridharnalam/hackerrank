package geeksforgeeks.practice.arrays;

import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1/?page=1&company[]=Facebook&sortBy=submissions#
public class SubArraySum {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,2,3,7,5}, 5, 12));
    }

    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int start = 0;
        int end = 0;
        int total = 0;
        boolean matched = false;

        for (int i = 0; i < n; i++) {
            if(total < s) {
                total+=arr[i];
            }

            while(total > s) {
                total -= arr[start];
                start++;
            }

            if (total == s) {
                end = i;
                matched = true;
                break;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        if(!matched){
            result.add(-1);
        } else {
            result.add(start+1);
            result.add(end+1);
        }
        return result;
    }
}

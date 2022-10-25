package leetcode.practice.problems;

import java.util.Arrays;
import java.util.List;

// 1239. Maximum Length of a Concatenated String with Unique Characters
public class MaxLengthConcatenatedString {

    public static void main(String[] args) {
//        System.out.println(maxLength(Arrays.asList("un", "iq", "ue")));
//        System.out.println(maxLength(Arrays.asList("cha","r","act","ers")));
//        System.out.println(maxLength(Arrays.asList("abcdefghijklmnopqrstuvwxyz")));
        System.out.println(maxLength(Arrays.asList("a", "abc", "d", "de", "def")));
    }
    static int max =0;
    public static int maxLength(List<String> arr) {
        backTrack(arr,"",0);
        return max;
    }

    private static void backTrack(List<String> arr, String current, int start){
        if(max<current.length())
            max =current.length();
        for(int i=start; i<arr.size();i++){
            if(!isValid(current,arr.get(i))) continue;
            backTrack(arr,current+arr.get(i),i+1);
        }
    }

    private static boolean isValid(String currentString, String newString){
        int[] array = new int[26];
        for(int i=0;i<newString.length();i++){
            if(++array[newString.charAt(i)-'a'] == 2) return false;  //to handle if the newString has duplicates then it's not valid
            if(currentString.contains(newString.charAt(i)+"")) // check if the currentString contains each char from newString
                return false;
        }
        return true;
    }
}

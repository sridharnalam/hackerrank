package leetcode.practice.problems;

// 1662. Check If Two String Arrays are Equivalent
public class TwoStringArraysEquivalent {

    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for(int i=0;i < word1.length || i < word2.length; i++){
            str1.append(i < word1.length ? word1[i] : "");
            str2.append(i < word2.length ? word2[i] : "");
        }
        return str1.toString().equals(str2.toString());
    }
}

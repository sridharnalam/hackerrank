package leetcode.practice.leetcode75;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbtc"));
        System.out.println(isSubsequence("abc", "ahcb"));
    }

    public static boolean isSubsequence(String s, String t) {
        for(int i=0;i<t.length();i++){
            String value = t.substring(i, i+1);
            if(s.startsWith(value)) {
                s = s.replaceFirst(value, "");
            }
            if(s.length()==0){
                break;
            }
        }
        return s.length()==0;
    }
}

package hackerrank.practice.algorithms;

public class AppendAndDelete {
    public static void main(String[] args) {
//        System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9));
//        System.out.println(appendAndDelete("aba", "aba", 9));
//        System.out.println(appendAndDelete("ashley", "ash", 2));
//        System.out.println(appendAndDelete("aaaaaaaaaa", "aaaaa", 7));
        System.out.println(appendAndDelete("qwerasdf", "qwerbsdf", 6));
//        System.out.println(appendAndDelete("y", "yu", 2));
    }

    public static String appendAndDelete(String s, String t, int k) {
        StringBuilder matchedString = new StringBuilder();
        s = s.trim();
        t = t.trim();
        for (int i = 0; i < s.length(); i++) {
            if (i < t.length() && s.charAt(i) == t.charAt(i)) {
                matchedString.append(s.charAt(i));
            } else {
                break;
            }
        }
        int sDiff = s.replaceFirst(matchedString.toString(), "").length();
        int tDiff = t.replaceFirst(matchedString.toString(), "").length();
        boolean isPossible = false;
        int toChangeLength = sDiff + tDiff;
        if (k == toChangeLength) {
            isPossible = true;
        } else if((2* matchedString.length())< (k- toChangeLength)){
            isPossible = true;
        } else if(k>toChangeLength && (k-toChangeLength)%2==0){
            isPossible = true;
        }
        return isPossible ? "Yes" : "No";
    }
}

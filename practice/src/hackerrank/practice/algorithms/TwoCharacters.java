package hackerrank.practice.algorithms;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TwoCharacters {
    public static void main(String[] args) {
        System.out.println(alternate("fefcdcdcdfcdk")); // cdcdcdcd
//        System.out.println(alternate("abaacdabd")); // bdbd
//        System.out.println(alternate("beabeefeabd")); // babab
//        System.out.println(alternate("asdcbsdcagfsdbgdfanfghbsfdab"));
//        System.out.println(alternate("asvkugfiugsalddlasguifgukvsa"));
//        System.out.println(alternate("tlymrvjcylhqifsqtyyzfaugtibkkghfhyzxqbsizkjguqlqwwetyofqihtpkmpdlgthfybfhhmjerjdkybwppwrdapirukcshkpngayrdruanjtziknnwxmsjpnuswllymhkmztsrcwwzmlbcoakswwffveobbvzinkhnmvwqhpfednhsuzmffaebi"));
//        System.out.println(alternate("cwomzxmuelmangtosqkgfdqvkzdnxerhravxndvomhbokqmvsfcaddgxgwtpgpqrmeoxvkkjunkbjeyteccpugbkvhljxsshpoymkryydtmfhaogepvbwmypeiqumcibjskmsrpllgbvc"));
//        System.out.println(alternate("txnbvnzdvasknhlmcpkbxdvofimsvqbvkswlkrchohwuplfujvlwpxtlcixpajjpaskrnjneelqdbxtiyeianqjqaikbukpicrwpnjvfpzolcredzmfaznnzd"));
//        System.out.println(alternate("pvmaigytciycvjdhovwiouxxylkxjjyzrcdrbmokyqvsradegswrezhtdyrsyhg"));
//        System.out.println(alternate("muqqzbcjmyknwlmlcfqjujabwtekovkwsfjrwmswqfurtpahkdyqdttizqbkrsmfpxchbjrbvcunogcvragjxivasdykamtkinxpgasmwz"));
//        System.out.println(alternate("cobmjdczpffbxputsaqrwnfcweuothoygvlzugazulgjdbdbarnlffzpogdprjxvtvbmxjujeubiofecvmjmxvofejdvovtjulhhfyadr"));
//        System.out.println(alternate("abaacefdddabbd"));
    }

    public static int alternate(String input) {
        Pattern p = Pattern.compile("(\\w)\\1+");
        for (Matcher m = p.matcher(input); m.find(); m = p.matcher(input)) {
            System.out.println("Duplicate character " + m.group(1));
            input = input.replace(m.group(1), "");
            System.out.println(input);
        }
        if (input.length() == 0 || input.length() == 1) {
            return 0;
        }
        Set<String> noDup = new HashSet<>();
        Collections.addAll(noDup, input.split(""));
        if (input.length() == noDup.size()) {
            return input.length();
        }
        Map<Character, Integer> mapped = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            mapped.merge(input.charAt(i), 1, Integer::sum);
        }
        System.out.println(mapped.toString());
        System.out.println(input);
        String[] split = input.split("");
        Set<String> set = new HashSet<>();
        Collections.addAll(set, split);
        int max =0;
        String result="";
        for (String splitKey : set) {
            String[] chunkList = input.split(splitKey);
            Set<Character> mappedList = null;
            for (String chunk : chunkList) {
                if (chunk == null || chunk.length() == 0) {
                    continue;
                }

                Map<Character, Integer> map = new HashMap<>();
                for (int i = 0; i < chunk.length(); i++) {
                    map.merge(chunk.charAt(i), 1, Integer::sum);
                }
                System.out.println(splitKey+" -> "+map.toString());
                if (mappedList == null) {
                    mappedList = new HashSet<>(map.keySet());
                }
                Set<Character> keySet = new HashSet<>(mappedList);
                for (Character key : keySet) {
                    if (map.get(key) != null && map.get(key) == 1) {
                        mappedList.add(key);
                    } else {
                        mappedList.remove(key);
                    }
                }
            }

            if (mappedList != null && mappedList.size()> 0) {
                System.out.println(splitKey + " ->> " + mappedList);
                for (Character probable : mappedList) {
                    String s = input;
                    List<Character> couple = Arrays.asList(probable, splitKey.charAt(0));
                    for (String key : set) {
                        Character charKey = key.charAt(0);
                        if (!couple.contains(charKey)) {
                            s = s.replace(key, "");
                        }
                    }
                    System.out.println("Probable result : " + s);
                    if(max < s.length()){
                        max = s.length();
                        result = s;
                    }
                }
            }
        }
        System.out.println("Final result : " + result);
        return max;
    }


}

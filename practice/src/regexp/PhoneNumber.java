package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {
//        final String regex = "@([A-Za-z0-9_.-])"; //""(@\\+<\\d{1,3}><\\d{10}>|@All)";
        final String regex = "@(\\w)+"; //""(@\\+<\\d{1,3}><\\d{10}>|@All)";
//        final String string = "the following are \n @+<101><7083034875>, @+<81><7083034875>, @+<1><7083034875> and @All are going home. \nExcept @+<81><123456789>";
//        final String string = "We are @all are doing @good @job @";
//        final String string = "Hey @+<81><7083131403>\n" + "H r u";
        final String string = "Hey @Avatar\n" + "H r u @dear";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);
        int count = 0;
        while (matcher.find()) {
            System.out.println(string.substring(matcher.start(), matcher.end()));
            count++;
        }
        System.out.println("Occurences: " + count);
    }
}

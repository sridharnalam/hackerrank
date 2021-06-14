package hackerrank.practice.algorithms;

public class DayOfTheProgrammer {

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(1800));
    }

    public static String dayOfProgrammer(int year) {
        if(year==1918) {
            return "26.09.1918";
        }
        boolean isLeap = (year<=1917 && year%4==0) || (year%400==0 || (year%4==0 && year%100!=0));
        return (isLeap? "12":"13")+".09."+year;
    }
}

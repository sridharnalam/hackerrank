package hackerrank.practice.warmup;

public class CountingValleys {
    public static void main(String[] args){
//        String[] path= {"D", "D", "U", "U", "U", "U", "D", "D"};
//        String[] path= {"U", "D", "D", "D", "U", "D", "U", "U"};
//        String[] path= {"U", "D", "D", "D", "U", "D", "U"};
//        String[] path= {"U", "D", "D", "D", "U", "D", "U", "U", "D", "U"};
        String[] path= {"D", "U","U", "D", "D", "D", "U", "D", "U", "U", "D", "U"};
        System.out.println("volleys count : "+countVolleys(path.length, path));
    }

    private static int countVolleys(int length, String[] path) {
        int level=0;
        int volleysCount =0;
        boolean doCount = false;
        for(String step: path) {
            char c = step.charAt(0);
            if(step.equals("U")){
                level +=1;
            } else {
                level -=1;
            }
            if(level > 0) {
                doCount = false;
            }
            if(level < 0) {
                doCount = true;
            }
            if(doCount && level == 0) {
                volleysCount +=1;
            }
        }
        return volleysCount;
    }
}

package hackerrank.practice.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {

    public static void main(String[] args) {
        System.out.println(migratoryBirds(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
    }

    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer birdId: arr){
            Integer count =map.get(birdId);
            if(count==null){
                count =0;
            }
            map.put(birdId, ++count);
        }
        Map.Entry<Integer, Integer> max = null;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(max ==null){
                max = entry;
                continue;
            }
            if(entry.getValue()>=max.getValue()){
                if(entry.getValue() > max.getValue() || entry.getKey()<max.getKey()) {
                    max = entry;
                }
            }
        }
        return max.getKey();
    }
}

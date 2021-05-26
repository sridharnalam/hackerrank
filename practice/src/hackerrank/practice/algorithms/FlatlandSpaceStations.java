package hackerrank.practice.algorithms;
import java.util.*;

public class FlatlandSpaceStations {
    public static void main(String[] args) {
        System.out.println(flatlandSpaceStations1(20, new int[]{13,1,11,10,6}));
    }

    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] c) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> spaceStations = new TreeSet<>();
        for(int i=0; i<c.length;i++){
            spaceStations.add(c[i]);
        }
        for(int i=0;i<n;i++){
            int distance =-1;
            if(spaceStations.contains(i)){
                distance = 0;
            } else {
                for(Integer station: spaceStations){
                    int current = Math.abs(i - station);
                    if(distance==-1 || distance>current) {
                        distance = current;
                    }
                }
            }
            map.put(i, distance);
        }
        System.out.println(map);
        return Collections.max(map.values());
    }

    static int flatlandSpaceStations1(int n, int[] c) {

        if(n==c.length){
            return 0;
        }
        Arrays.sort(c);
        int maxDistance = c[0];
        if(c[c.length-1]<n-1){
            int distance = Math.abs((n-1)-c[c.length-1]);
            if(maxDistance<distance){
                maxDistance = distance;
            }
        }
        for(int i = 0; i<c.length-1; i++){
            int distance = Math.abs(c[i+1]-c[i])/2;
            if(distance>maxDistance){
                maxDistance = distance;
            }
        }
        return maxDistance;
    }
}

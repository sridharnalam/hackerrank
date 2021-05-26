package hackerrank.practice.arrays;

import java.util.*;

public class NewYearChaos {
    public static void main(String[] args) {
        List<Integer> queue = Arrays.asList(1, 2, 5, 3, 7, 8, 6, 4);
        minimumBribes(queue);
    }

    public static void minimumBribes1(List<Integer> q) {
        long totalBribes = 0;
        List<Integer> p = new ArrayList<>();
        Map<Integer, Integer> copy = new HashMap<>();
        for(int i=0;i<q.size();i++) {
            copy.put(q.get(i), i);
        }
        for(int i=0; i<q.size(); i++){
            p.add(i+1);
        }
        for(int i=0; i<q.size();i++) {
            if(!p.get(i).equals(q.get(i))) {
                int range = p.indexOf(q.get(i));
                if((range-i)>2) {
                    totalBribes = -1;
                    break;
                } else {
                    totalBribes += (range - i);
                }
                List<Integer> sub = new ArrayList<>(p.subList(i, range));
                p.set(i, q.get(i));
                for(int j=0; j<sub.size(); j++) {
                    p.set(i+j+1, sub.get(j));
                }
                System.out.println(p.toString());
            }
        }
        if(totalBribes==-1) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(totalBribes);
        }
    }

    public static void minimumBribes(List<Integer> result) {
        long totalBribes = 0;
        Map<Integer, Integer> kMap = new HashMap<>();
        for(int i=0; i<result.size(); i++){
            kMap.put(i+1, i);
        }
        List<Integer> p = new ArrayList<>();
        for(int i=0; i<result.size(); i++){
            p.add(i+1);
        }
        for(int i=0; i<result.size();i++) {
            if(!p.get(i).equals(result.get(i))) {
                int range = kMap.get(result.get(i));
                if((range-i)>2) {
                    totalBribes = -1;
                    break;
                } else {
                    totalBribes += (range - i);
                }
                List<Integer> sub = new ArrayList<>();
                for(int j =i;j<range;j++){
                    sub.add(p.get(j));
                }
                p.set(i, result.get(i));
                kMap.put(result.get(i), i);
                for(int j=0; j<sub.size(); j++) {
                    p.set(i+j+1, sub.get(j));
                    kMap.put(sub.get(j), i+j+1);
                }
                System.out.println(p.toString() +" "+(range-i));
            }
        }
        if(totalBribes==-1) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(totalBribes);
        }
    }
}

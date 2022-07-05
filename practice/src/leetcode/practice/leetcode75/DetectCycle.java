package leetcode.practice.leetcode75;

import java.util.HashSet;
import java.util.Set;

public class DetectCycle {
    public static void main(String[] args) {

    }

    public static ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        while (head != null) {
            if(set.size()==0){
                set.add(head);
            }
            ListNode next = head.next;
            if (next == null) {
                return null;
            } else {
                if(set.contains(next)) {
                    return next;
                } else {
                    set.add(next);
                }
            }
            head = head.next;
        }
        return null;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


}

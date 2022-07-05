package leetcode.practice.leetcode75;

import java.util.HashMap;
import java.util.Map;

public class MiddleNodeLinkedList {

    public ListNode middleNode(ListNode head) {

        Map<Integer, ListNode> map = new HashMap<>();
        int count = 0;
        do {
            map.put(++count, head);
            head = head.next;
        } while (head != null);
        return map.get(count / 2 + 1);
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

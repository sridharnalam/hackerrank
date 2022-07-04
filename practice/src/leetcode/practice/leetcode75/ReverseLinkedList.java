package leetcode.practice.leetcode75;

import java.util.Arrays;
import java.util.List;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode listNode = feedData(Arrays.asList(1));
        ListNode result = reverseList1(listNode);
        iteratedPrint(result);
    }

    private static void iteratedPrint(ListNode result) {
        if (result == null) {
            return;
        }
        do {
            System.out.print(result.val + " ");
            result = result.next;
        } while (result != null);
        System.out.println();
    }

    // Solution 1
    public static ListNode reverseList(ListNode head) {
        ListNode tail = null;
        while (head != null) {
            tail = new ListNode(head.val, tail);
            head = head.next;
        }
        return tail;
    }

    // Solution 2
    public static ListNode reverseList1(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode curr = null, prev = null, old = null;
        do {
            if (prev != null) {
                old = prev;
            }
            if (curr != null) {
                if (prev == null) {
                    prev = curr;
                    prev.next = null;
                } else {
                    prev = curr;
                }
            }
            curr = head;
            head = head.next;
            if (old != null) {
                prev.next = old;
            }
        } while (head != null);
        if (prev != null) {
            curr.next = prev;
        }
        return curr;
    }

    private static ListNode feedData(List<Integer> valList) {
        ListNode first = null, curr = null;
        for (Integer val : valList) {
            ListNode listNode = new ListNode(val);
            if (curr == null) {
                curr = listNode;
                first = listNode;
            } else {
                curr.next = listNode;
                curr = listNode;
            }
        }
        return first;
    }

    public static class ListNode {
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

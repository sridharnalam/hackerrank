package leetcode.practice.leetcode75;

import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode listNode1 = feedData(Arrays.asList(1, 2, 4));
        ListNode listNode2 = feedData(Arrays.asList(1, 3, 4));
        ListNode result = mergeTwoLists(listNode1, listNode2);
        iteratedPrint(result);
        result = mergeTwoLists(null, listNode2);
        iteratedPrint(result);
        result = mergeTwoLists(listNode1, null);
        iteratedPrint(result);
        result = mergeTwoLists(null, null);
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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode first = null, prev = null, curr = list1;

        do {
            if (curr==null || curr.val > list2.val) {
                ListNode temp = list2.next;
                if (prev != null) {
                    prev.next = list2;
                }
                if (prev == null) {
                    first = list2;
                }
                prev = list2;
                prev.next = curr;
                list2 = temp;

            } else {
                if (prev == null) {
                    first = curr;
                }
                prev = curr;
                curr = curr.next;
            }
        } while (list2 != null);
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

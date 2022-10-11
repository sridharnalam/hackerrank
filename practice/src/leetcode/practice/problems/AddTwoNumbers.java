package leetcode.practice.problems;

// 2. Add Two Numbers
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = feedListNode(new int[]{9,9,9,9,9,9,9});
        ListNode l2 = feedListNode(new int[]{9,9,9,9});
        parseListNode(addTwoNumbers(l1, l2));
    }

    public static ListNode feedListNode(int[] data) {
        ListNode first = null;
        ListNode dataNode = null;
        for (int i : data) {
            if(dataNode==null){
                dataNode = new ListNode(i);
                first = dataNode;
            } else {
                ListNode d = new ListNode(i);
                dataNode.next = d;
                dataNode = d;
            }
        }
        return first;
    }

    public static void parseListNode(ListNode listNode) {
        do {
            System.out.print(" " + listNode.val);
            listNode = listNode.next;
        } while (listNode != null);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode sum = null;
        ListNode first = null;
        do {
            int a = l1 != null ? l1.val : 0;
            int b = l2 != null ? l2.val : 0;
            int add = carry + a + b;
            carry = add / 10;
            add = add % 10;
            if (sum == null) {
                sum = new ListNode(add);
                first = sum;
            } else {
                ListNode newNode = new ListNode(add);
                sum.next = newNode;
                sum = newNode;
            }
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        } while (l1 != null || l2 != null || carry > 0);
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

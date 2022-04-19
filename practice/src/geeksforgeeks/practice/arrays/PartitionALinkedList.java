package geeksforgeeks.practice.arrays;

import java.util.ArrayList;
import java.util.List;

// Partition a Linked List around a given value
// https://practice.geeksforgeeks.org/problems/partition-a-linked-list-around-a-given-value/1
public class PartitionALinkedList {
    public static void main(String[] args) {
        Node head = getRawLinkedListHead();
        printNode(head);

        Node result = partition(head, 5);
        printNode(result);
    }

    private static void printNode(Node result) {
        System.out.println();
        while (result.next != null){
            System.out.print(result.data);
            result = result.next;
        }
    }

    private static Node getRawLinkedListHead() {
        Node head = new Node(7);

        Node node = head;
        node.next = new Node(5);

        node = node.next;
        node.next = new Node(4);

        node = node.next;
        node.next = new Node(2);

        node = node.next;
        node.next = new Node(9);

        node = node.next;
        node.next = new Node(6);
        return head;
    }

    public static Node partition(Node node, int x) {
        List<Integer> small = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();

        while (node != null){
            if(node.data<x){
                small.add(node.data);

            } else if(node.data == x){
                equal.add(node.data);
            } else {
                greater.add(node.data);
            }
            node = node.next;
        }
        small.addAll(equal);
        small.addAll(greater);
        Node head = new Node(small.get(0));
        node = head;
        for (int i = 1; i < small.size(); i++) {
            Node newNode = new Node(small.get(i));
            node.next = newNode;
            node = newNode;
        }
        return head;
    }

    static class Node {
        int data;
        Node next;

        Node(int key) {
            data = key;
            next = null;
        }
    }
}

package leetcode.practice.leetcode75;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversalDFS {
    public static void main(String[] args) {

    }

    public static List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        Stack<Node> nodeStack= new Stack<>();
        list.add(root.val);
        nodeStack.push(root);
        return null;
    }

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;
}

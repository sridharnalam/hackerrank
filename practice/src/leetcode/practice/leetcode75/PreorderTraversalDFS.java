package leetcode.practice.leetcode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 589. N-ary Tree Preorder Traversal
 */
public class PreorderTraversalDFS {
    public static void main(String[] args) {
        System.out.println(preorder(prepareInput()));
    }

    private static Node prepareInput() {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node3.children = Arrays.asList(node5, node6);
        node1.children = Arrays.asList(node3, node2, node4);
        return node1;
    }

    public static List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        Stack<Node> nodeStack = new Stack<>();
        nodeStack.push(root);
        while (!nodeStack.empty()) {
            Node parentNode = nodeStack.pop();
            if (parentNode == null) {
                break;
            }
            list.add(parentNode.val);
            if (parentNode.children != null) {
                for (int i = parentNode.children.size() - 1; i >= 0; i--) {
                    nodeStack.push(parentNode.children.get(i));
                }
            }
        }
        return list;
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

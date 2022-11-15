package leetcode.practice.dailychallenge;
// 222. Count Complete Tree Nodes
public class CountCompleteTreeNodes {

    public static void main(String[] args) {
        System.out.println(countNodes(new TreeNode(1)));
    }

    public static int countNodes(TreeNode root) {

        return doCount(root, 0);
    }

    public static int doCount(TreeNode root, int count) {
        if (root != null) {
            count++;
        }
        if (root.left != null) {
            count = doCount(root.left, count);
        }
        if (root.right != null) {
            count = doCount(root.right, count);
        }
        return count;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

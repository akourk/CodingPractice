package LeetCode110BalancedBinaryTree;

// Given a binary tree, determine if it is height-balanced.

// For this problem, a height-balanced binary tree is defined as:

// "a binary tree in which the left and right subtrees of every node differ in height by no more than 1."

//      3
//     / \
//    9   20
//       /  \
//      15   7

// Output: True

//          1
//         / \
//        2   2
//       / \
//      3   3
//     / \
//    4   4

// Output: False

public class Main {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        t1.left = new TreeNode(9);
        t1.right = new TreeNode(20);
        t1.right.left = new TreeNode(15);
        t1.right.right = new TreeNode(7);
        System.out.println("true: " + Solution.isBalanced(t1));

        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);
        t2.left.left = new TreeNode(3);
        t2.left.right = new TreeNode(3);
        t2.left.left.left = new TreeNode(4);
        t2.left.left.right = new TreeNode(4);
        t2.right = new TreeNode(2);
        System.out.println("false: " + Solution.isBalanced(t2));
    }
}

class Solution {
    public static boolean isBalanced(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return true;

        int left = checkHeight(root.left);
        int right = checkHeight(root.right);

        return (right - left == 1 || left - right == 1 || right - left == 0)
                && isBalanced(root.left)
                && isBalanced(root.right);
    }
    public static int checkHeight(TreeNode node) {
        if (node == null)
            return 0;

        return Math.max(checkHeight(node.left), checkHeight(node.right)) + 1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {};
    TreeNode(int val) { this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// slightly faster solution:
//class Solution {
//    public static boolean isBalanced(TreeNode root) {
//        if (root == null)
//            return true;
//        if (root.left == null && root.right == null)
//            return true;
//        int l = helper(root.left);
//        int r = helper(root.right);
//        return l >= 0 && r >= 0 && Math.abs(l - r) <= 1;
//    }
//    private static int helper(TreeNode root) {
//        if (root == null)
//            return 0;
//        int l = helper(root.left);
//        int r = helper(root.right);
//        if (l < 0 || r < 0 || Math.abs(l - r) > 1)
//            return -1;
//        return Math.max(l, r) + 1;
//    }
//}

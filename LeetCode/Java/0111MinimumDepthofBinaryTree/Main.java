package LeetCode111MinimumDepthofBinaryTree;

// Given a binary tree, find its minimum depth.

// The minimum depth is the number of nodes along the shortest path fromt he root node down to the nearest leaf node.

// Note: A leaf is a node with no children.

// Ex:

//      3
//     / \
//    9   20
//       /  \
//      15   7

// Output: 2


import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        t1.left = new TreeNode(9);
        t1.right = new TreeNode(20);
        t1.right.left = new TreeNode(15);
        t1.right.right = new TreeNode(7);

        System.out.println("2: " + Solution.minDepth(t1));

        TreeNode t2 = new TreeNode(2);
        t2.right = new TreeNode(3);
        t2.right.right = new TreeNode(4);
        t2.right.right.right = new TreeNode(5);
        t2.right.right.right.right = new TreeNode(6);

        System.out.println("5: " + Solution.minDepth(t2));
    }
}

class Solution {
    public static int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        return depth(root);
    }
    private static int depth(TreeNode node) {
        if (node == null)
            return Integer.MAX_VALUE;

        if (node.left == null && node.right == null)
            return 1;

        return Math.min(depth(node.left), depth(node.right)) + 1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


// done with queue

//class Solution {
//    public static int minDepth(TreeNode root) {
//        if (root == null)
//            return 0;
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//
//        int depth = 1;
//
//        while (!queue.isEmpty()) {
//            int size =  queue.size();
//            for (int i = 0; i < size; i++) {
//                TreeNode curr = queue.remove();
//                if (curr.left == null && curr.right == null)
//                    return depth;
//                if (curr.left != null)
//                    queue.add(curr.left);
//                if (curr.right != null)
//                    queue.add(curr.right);
//            }
//            depth++;
//        }
//        return depth;
//    }
//}
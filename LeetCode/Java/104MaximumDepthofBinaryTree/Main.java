package LeetCode104MaximumDepthofBinaryTree;

// Given a binary tree, find its maximum depth.

// The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

// Note: A leaf is a node with no children.

// Example:
// Given binary tree [3, 9, 20, null, null, 15, 7],

//      3
//     / \
//    9   20
//       /  \
//      15   7

// return its depth = 3

public class Main {
    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(3);
        t1.left = new TreeNode(9);
        t1.right = new TreeNode(20);
        t1.right.left = new TreeNode(15);
        t1.right.right = new TreeNode(7);

        System.out.println("3: " + Solution.maxDepth(t1));

        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);
        t2.right = new TreeNode(3);
        t2.left.left = new TreeNode(4);
        t2.right.right = new TreeNode(5);

        System.out.println("3: " + Solution.maxDepth(t2));


    }
}

class Solution {
    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        else if (root.right == null) {
            return traverse(root.left, 1);
        } else if (root.left == null) {
            return traverse(root.right, 1);
        } else {
            return Math.max(traverse(root.left, 1), traverse(root.right, 1));
        }
    }

    public static int traverse(TreeNode root, int depth) {
        if (root.left == null && root.right == null) {
            return depth + 1;
        } else if (root.right == null) {
            return traverse(root.left, depth + 1);
        } else if (root.left == null) {
            return traverse(root.right, depth + 1);
        } else {
            return Math.max(traverse(root.left, depth + 1), traverse(root.right, depth + 1));
        }
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

/*

// much shorter solution (same runtime):

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = maxDepth(root.left) + 1;
        int right = maxDepth(root.right) + 1;
        return Math.max(left, right);
    }
}

// less memory solution:

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}


 */
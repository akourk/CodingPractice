package LeetCode112PathSum;

// Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding
// up all the values along the path equals the given sum.

// Note: A leaf is a node with no children

// Ex:
// Given the below binary tree and sum = 22,

//              5
//             / \
//            4   8
//           /   /  \
//         11   13   4
//        /  \        \
//       7    2        1

// return true, as there exists a root-to-leaf path 5->4->11->2 which sum is 22.


import com.sun.source.tree.Tree;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.val == sum && (root.left == null && root.right == null))
            return true;
        return hasPathSum(root.left, sum - root.val)
                || hasPathSum(root.right, sum - root.val);
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

// lowest memory solution:

//class Solution {
//    static boolean res = false;
//    public static boolean hasPathSum(TreeNode root, int sum) {
//        res = false;
//        if (root == null)
//            return false;
//        connect(root, sum);
//        return res;
//    }
//    private static void connect(TreeNode root, int sum) {
//        if (root == null)
//            return;
//        connect(root.left, sum - root.val);
//        connect(root.right, sum - root.val);
//    }
//}
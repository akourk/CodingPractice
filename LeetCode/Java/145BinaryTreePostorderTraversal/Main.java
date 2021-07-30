package LeetCode145BinaryTreePostorderTraversal;

/*
Given the root of a binary tree, return the postorder traversal of its nodes' values.

Example 1:
Input: root = [1,null,2,3]
Output: [3,2,1]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]
Example 4:
Input: root = [1,2]
Output: [2,1]
Example 5:
Input: root = [1,null,2]
Output: [2,1]

Constraints:

The number of the nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100

Follow up: Recursive solution is trivial, could you do it iteratively?
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();

        if (root == null)
            return ret;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        TreeNode prev = null;

        while (!stack.isEmpty()) {
            TreeNode curr = stack.peek();

            if (prev == null || prev.left == curr || prev.right == curr)
                if (curr.left != null)
                    stack.push(curr.left);
                else if (curr.right != null)
                    stack.push(curr.right);
                else {
                    stack.pop();
                    ret.add(curr.val);
                }
            else if (curr.left == prev)
                if (curr.right != null)
                    stack.push(curr.right);
                else {
                    stack.pop();
                    ret.add(curr.val);
                }
            else if (curr.right == prev) {
                stack.pop();
                ret.add(curr.val);
            }

            prev = curr;
        }
        return ret;
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
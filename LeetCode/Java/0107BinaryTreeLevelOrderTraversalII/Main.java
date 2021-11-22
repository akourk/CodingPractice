package LeetCode107BinaryTreeLevelOrderTraversalII;

// Given a binary tree, return the bottom-up level order traversal of its nodes' values.
// (ie, from left to right, level by level from leaf to root).

// For example:
// Given binary tree [3, 9, 20, null, null, 15, 7]
//      3
//     / \
//    9  20
//      /  \
//     15   7

// return its bottom-up level order traversal as:
// [
//  [15, 7],
//  [9, 20],
//  [3]
// ]


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        t1.left = new TreeNode(9);
        t1.right = new TreeNode(20);
        t1.right.left = new TreeNode(15);
        t1.right.right = new TreeNode(7);

        List<List<Integer>> result = Solution.levelOrderBottom(t1);
        System.out.println(result);
    }
}

class Solution {
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        LinkedList<TreeNode> curr = new LinkedList<>();
        LinkedList<TreeNode> next = new LinkedList<>();
        curr.offer(root);

        ArrayList<Integer> numberList = new ArrayList<>();

        // need to track when each level starts
        while (!curr.isEmpty()) {
            TreeNode head = curr.poll();

            numberList.add(head.val);

            if (head.left != null)
                next.offer(head.left);
            if (head.right != null)
                next.offer(head.right);
            if (curr.isEmpty()) {
                curr = next;
                next = new LinkedList<TreeNode>();
                result.add(numberList);
                numberList = new ArrayList<Integer>();
            }
        }

        // return Collections.reverse(result);
        List<List<Integer>> reversedResult = new ArrayList<List<Integer>>();
        for (int i = result.size() - 1; i >= 0; i--)
            reversedResult.add(result.get(i));

        return reversedResult;
    }
}

/* fastest solution:
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> list = new LinkedList<>();
        if (root == null)
            return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> temp = new LinkedList<>();
        while(q.size() != 1) {
            TreeNode x = q.poll();
            if (x == null) {
                list.addFirst(temp);
                temp = new LinkedList<>();
                q.add(x);
            } else {
                temp.add(x.val);
                if (x.left != null)
                    q.add(x.left);
                if (x.right != null)
                    q.add(x.right);
            }
        }
        list.addFirst(temp);
        return list;
    }
}
 */

// this works with arraylist
//class Solution {
//    public static List<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
//        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
//        if (root == null)
//            return result;
//
//        LinkedList<TreeNode> curr = new LinkedList<>();
//        LinkedList<TreeNode> next = new LinkedList<>();
//        curr.offer(root);
//
//        ArrayList<Integer> numberList = new ArrayList<>();
//
//        // need to track when each level starts
//        while (!curr.isEmpty()) {
//            TreeNode head = curr.poll();
//
//            numberList.add(head.val);
//
//            if (head.left != null)
//                next.offer(head.left);
//            if (head.right != null)
//                next.offer(head.right);
//            if (curr.isEmpty()) {
//                curr = next;
//                next = new LinkedList<TreeNode>();
//                result.add(numberList);
//                numberList = new ArrayList<Integer>();
//            }
//        }
//
//        // return Collections.reverse(result);
//        ArrayList<ArrayList<Integer>> reversedResult = new ArrayList<ArrayList<Integer>>();
//        for (int i = result.size() - 1; i >= 0; i--)
//            reversedResult.add(result.get(i));
//
//        return reversedResult;
//    }
//}

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
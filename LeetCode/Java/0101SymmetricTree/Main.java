package LeetCode101SymmetricTree;

// Given a binary tree check whether it is a mirror of itself (ie, symmetric around its center).

// For example, this binary tree [1, 2, 2, 3, 4, 4, 3] is symmetric:

//        1
//       / \
//      2   2
//     / \ / \
//    3  4 4  3

// But the following [1, 2, 2, null, 3, null, 3] is not:

//        1
//       / \
//      2   2
//       \   \
//       3    3

// Follow up: Solve it both recursively and iteratively

public class Main {
    public static void main(String[] args) {

        TreeNode tn1 = new TreeNode(1);
        tn1.left = new TreeNode(2);
        tn1.right = new TreeNode(2);
        tn1.left.left = new TreeNode(3);
        tn1.right.right = new TreeNode(3);
        tn1.left.right = new TreeNode(4);
        tn1.right.left = new TreeNode(4);

        System.out.println(Solution.isSymmetric(tn1));

        TreeNode tn2 = new TreeNode(1);
        tn2.left = new TreeNode(2);
        tn2.right = new TreeNode(2);
        tn2.left.right = new TreeNode(3);
        tn2.right.right = new TreeNode(3);

        System.out.println(Solution.isSymmetric(tn2));

        TreeNode tn3 = new TreeNode(1);
        tn3.left = new TreeNode(2);
        tn3.right = new TreeNode(3);
        tn3.left.left = new TreeNode(4);
        tn3.left.right = new TreeNode(5);
        tn3.right.left = new TreeNode(6);
        tn3.right.right = new TreeNode(7);

        System.out.println(Solution.isSymmetric(tn3));
    }
}

class TreeNode {
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

class Solution {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;

        return isMirror(root, root);
    }

    public static boolean isMirror(TreeNode root, TreeNode mirror) {
        if (root == null && mirror == null)
            return true;
        else if (root == null || mirror == null)
            return false;
        else {
            return (root.val == mirror.val) &&
                    isMirror(root.left, mirror.right) &&
                    isMirror(root.right, mirror.left);
        }
    }
}




// my initial attempt, which was accepted:

//class Solution {
//    public static boolean isSymmetric(TreeNode root) {
//
//        if (root == null)
//            return true;
//
//        TreeNode mirror = mirrorify(root);
//
//        return isIdentical(root, mirror);
//    }
//
//    public static boolean isIdentical(TreeNode root, TreeNode mirror) {
//
//        if (root == null && mirror == null)
//            return true;
//        else if ((root != null && mirror == null) || (mirror != null && root == null))
//            return false;
//        else {
//            if ((root.val == mirror.val) &&
//                    isIdentical(root.left, mirror.left) &&
//                    isIdentical(root.right, mirror.right))
//                return true;
//            else
//                return false;
//        }
//    }
//
//    public static TreeNode mirrorify(TreeNode root) {
//        if (root == null)
//            return null;
//        TreeNode mirror = new TreeNode(root.val);
//        mirror.right = mirrorify(root.left);
//        mirror.left = mirrorify(root.right);
//        return mirror;
//    }
//
//
//    public static void postOrder(TreeNode root) {
//        if (root == null) {
//            System.out.println("null");
//            return;
//        }
//        postOrder(root.left);
//        postOrder(root.right);
//        System.out.println(root.val);
//    }
//
//    public static void inOrder(TreeNode root) {
//        if (root == null) {
//            System.out.println("null");
//            return;
//        }
//        inOrder(root.left);
//        System.out.println(root.val);
//        inOrder(root.right);
//    }
//
//    public static void preOrder(TreeNode root) {
//        if (root == null) {
//            System.out.println("null");
//            return;
//        }
//
//        System.out.println(root.val);
//        preOrder(root.left);
//        preOrder(root.right);
//    }
//
//}

package question;

import datastructure.TreeNode;

public class Q404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.val + sumOfLeftLeaves(root.right);
        }

        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}

/*
404. Sum of Left Leaves
 */

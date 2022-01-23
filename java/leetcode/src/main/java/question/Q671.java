package question;

import datastructure.TreeNode;

public class Q671 {
    public int findSecondMinimumValue(TreeNode root) {
        if (root.left == null) return -1;
        int left = (root.left.val == root.val) ? findSecondMinimumValue(root.left) : root.left.val;
        int right = (root.right.val == root.val) ? findSecondMinimumValue(root.right) : root.right.val;

        return (left == -1 || right == -1) ? Math.max(left, right) : Math.min(left, right);
    }
}

/*
671. Second Minimum Node In a Binary Tree
 */

package question;

import datastructure.TreeNode;

public class Q124 {
    /*
    DFS
     */

    public int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (root == null) return 0;

        helper(root);

        return max;
    }

    private int helper(TreeNode root) {
        if (root == null) return 0;

        int leftMax = Math.max(0, helper(root.left));
        int rightMax = Math.max(0, helper(root.right));

        max = Math.max(max, leftMax + rightMax + root.val);

        return Math.max(leftMax, rightMax) + root.val;
    }
}

/*
124. Binary Tree Maximum Path Sum
 */


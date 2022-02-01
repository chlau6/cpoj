package question;

import datastructure.TreeNode;

public class Q124 {
    /*
    DFS
     */
    int result = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);

        return result;
    }

    public int dfs(TreeNode root) {
        if (root == null) return 0;

        int left = Math.max(dfs(root.left), 0);
        int right = Math.max(dfs(root.right), 0);

        result = Math.max(result, root.val + left + right);

        return Math.max(left, right) + root.val;
    }
}

/*
124. Binary Tree Maximum Path Sum
 */


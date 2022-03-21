package question;

import datastructure.TreeNode;

public class Q337 {
    public int rob(TreeNode root) {
        int[] result = dfs(root);

        return Math.max(result[0], result[1]);
    }

    public int[] dfs(TreeNode root) {
        if (root == null) return new int[2];

        int[] left = dfs(root.left);
        int[] right = dfs(root.right);

        int[] result = new int[2];
        result[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        result[1] = root.val + left[0] + right[0];

        return result;
    }

    /*
    Memoization
     */
    public int rob2(TreeNode root) {
        int[] result = dfs(root);

        return Math.max(result[0], result[1]);
    }

    public int[] dfs2(TreeNode root) {
        if (root == null) return new int[2];

        int[] left = dfs(root.left);
        int[] right = dfs(root.right);

        int[] result = new int[2];
        result[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        result[1] = root.val + left[0] + right[0];

        return result;
    }
}

/*
337. House Robber III
 */

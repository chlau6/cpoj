package question;

import datastructure.TreeNode;

public class Q1026 {
    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }

    public int dfs(TreeNode node, int min, int max) {
        if (node == null) return max - min;

        max = Math.max(max, node.val);
        min = Math.min(min, node.val);

        return Math.max(dfs(node.left, min, max), dfs(node.right, min, max));
    }
}

/*
1026. Maximum Difference Between Node and Ancestor
 */

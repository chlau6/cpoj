package question;

import datastructure.TreeNode;

public class Q1123 {
    int maxDepth = 0;
    TreeNode result;

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        dfs(root, 0);

        return result;
    }

    public int dfs(TreeNode node, int depth) {
        maxDepth = Math.max(maxDepth, depth);

        if (node == null) return depth;

        int left = dfs(node.left, depth + 1);
        int right = dfs(node.right, depth + 1);

        if (left == maxDepth && right == maxDepth) {
            result = node;
        }

        return Math.max(left, right);
    }
}

/*
1123. Lowest Common Ancestor of Deepest Leaves
 */

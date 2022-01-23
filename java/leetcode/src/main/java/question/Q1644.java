package question;

import datastructure.TreeNode;

public class Q1644 {
    int count = 0;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ans = dfs(root, p, q);
        return count == 2 ? ans : null;
    }

    private TreeNode dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        if (root == p || root == q) {
            count++;
            return root;
        }

        TreeNode leftLCA = dfs(root, p, q);
        TreeNode rightLCR = dfs(root, p, q);

        if (leftLCA != null && rightLCR != null) {
            return root;
        } else if (leftLCA != null) {
            return leftLCA;
        } else {
            return rightLCR;
        }
    }
}

/*
1644. Lowest Common Ancestor of a Binary Tree II
 */

package question;

import datastructure.TreeNode;

public class Q783 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    TreeNode prev = null;
    int minDiff = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        inorder(root);

        return minDiff;
    }

    public void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        if (prev != null) {
            minDiff = Math.min(minDiff, Math.abs(root.val - prev.val));
        }

        prev = root;

        inorder(root.right);
    }
}

/*
783. Minimum Distance Between BST Nodes
 */


package question;

import annotation.Strings;
import datastructure.TreeNode;

@Strings
public class Q530 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    TreeNode prev = null;
    Integer result = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);

        return result;
    }

    public void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        if (prev != null) {
            result = Math.min(result, Math.abs(prev.val - root.val));
        }

        prev = root;

        inorder(root.right);
    }
}

/*
530. Minimum Absolute Difference in BST
 */

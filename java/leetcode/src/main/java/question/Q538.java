package question;

import datastructure.TreeNode;

public class Q538 {
    int suffixSum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;

        if (root.right != null) {
            convertBST(root.right);
        }

        suffixSum += root.val;
        root.val = suffixSum;

        if (root.left != null) {
            convertBST(root.left);
        }

        return root;
    }
}

/*
538. Convert BST to Greater Tree
 */

package question;

import datastructure.TreeNode;

public class Q1038 {
    int suffixSum = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root.right != null) {
            bstToGst(root.right);
        }

        suffixSum += root.val;
        root.val = suffixSum;

        if (root.left != null) {
            bstToGst(root.left);
        }

        return root;
    }
}

/*
1038. Binary Search Tree to Greater Sum Tree
 */

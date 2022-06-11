package question;

import datastructure.TreeNode;

public class Q1038 {
    int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root == null) return null;

        bstToGst(root.right);
        sum += root.val;
        root.val = sum;
        bstToGst(root.left);

        return root;
    }
}

/*
1038. Binary Search Tree to Greater Sum Tree
 */

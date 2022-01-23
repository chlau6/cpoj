package question;

import datastructure.TreeNode;

public class Q897 {
    public TreeNode increasingBST(TreeNode root) {
        return inorder(root, null);
    }

    public TreeNode inorder(TreeNode root, TreeNode leaf) {
        if (root == null) return leaf;

        TreeNode node = inorder(root.left, root);
        root.left = null;
        root.right = inorder(root.right, leaf);

        return node;
    }
}

/*
896. Monotonic Array
 */

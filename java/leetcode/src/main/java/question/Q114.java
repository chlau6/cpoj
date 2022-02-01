package question;

import datastructure.TreeNode;

public class Q114 {
    /*
    Recursive
     */
    public void flatten(TreeNode root) {
        if (root == null) return;

        flatten(root.left);
        flatten(root.right);

        TreeNode temp = root.right;
        root.right = root.left;

        root.left = null;

        while (root.right != null) {
            root = root.right;
        }

        root.right = temp;
    }

    /*
    Iterative
     */
    public void flatten2(TreeNode root) {
        TreeNode curr = root;

        while (curr != null) {
            if (curr.left != null) {
                TreeNode node = curr.left;

                while (node.right != null) {
                    node = node.right;
                }

                node.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }

            curr = curr.right;
        }
    }
}

/*
113. Path Sum II
 */
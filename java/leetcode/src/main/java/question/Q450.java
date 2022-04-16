package question;

import datastructure.TreeNode;

public class Q450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                root = root.right;
            } else if (root.right == null) {
                root = root.left;
            } else {
                TreeNode curr = root.right;

                while (curr.left != null) {
                    curr = curr.left;
                }

                root.val = curr.val;
                root.right = deleteNode(root.right, curr.val);
            }
        }

        return root;
    }
}

/*
450. Delete Node in a BST
 */

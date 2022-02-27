package question;

import datastructure.TreeNode;

public class Q222 {
    public int countNodes(TreeNode root) {
        int result = 0;

        int height = height(root);

        while (root != null) {
            int rightHeight = height(root.right);

            if (rightHeight == height - 1) {
                result += (1 << height);
                root = root.right;
            } else {
                result += (1 << (height - 1));
                root = root.left;
            }

            height--;
        }

        return result;
    }

    public int countNodes2(TreeNode root) {
        int h = height(root);

        if (h < 0) {
            return 0;
        }

        int rightHeight = height(root.right);

        if (rightHeight == h - 1) {
            return (1 << h) + countNodes(root.right);
        } else {
            return (1 << (h - 1)) + countNodes(root.left);
        }
    }

    public int height(TreeNode root) {
        return root == null ? -1 : 1 + height(root.left);
    }
}

/*
222. Count Complete Tree Nodes
 */

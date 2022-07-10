package question;

import datastructure.TreeNode;

public class Q2331 {
    public boolean evaluateTree(TreeNode root) {
        if (root.left == null && root.right == null) return root.val > 0;

        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);

        if (root.val == 2) {
            return left || right;
        } else {
            return left && right;
        }
    }
}

/*
2331. Evaluate Boolean Binary Tree
*/

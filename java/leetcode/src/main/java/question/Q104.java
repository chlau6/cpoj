package question;

import datastructure.TreeNode;

public class Q104 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

/*
104. Maximum Depth of Binary Tree
 */

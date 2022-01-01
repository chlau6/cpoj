package question;

import datastructure.TreeNode;

public class Q543 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    int longest = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);

        return longest;
    }

    public int helper(TreeNode root) {
        if (root == null) return 0;

        int left = helper(root.left);
        int right = helper(root.right);

        longest = Math.max(longest, left + right);

        return 1 + Math.max(left, right);
    }
}

/*
543. Diameter of Binary Tree
 */

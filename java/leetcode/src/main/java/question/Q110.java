package question;

import annotation.BinaryTree;
import annotation.DepthFirstSearch;
import annotation.Tree;
import datastructure.TreeNode;

@Tree
@DepthFirstSearch
@BinaryTree
public class    Q110 {
    /*
    Bottom Up
    Time Complexity: O(n)   Space Complexity: O(h)
     */
    public boolean isBalanced(TreeNode root) {
        return helper(root) != -1;
    }

    public int helper(TreeNode root) {
        if (root == null) return 0;

        int left = helper(root.left);
        if (left == -1) return -1;
        int right = helper(root.right);
        if (right == -1) return -1;

        if (Math.abs(left - right) > 1) return -1;
        return 1 + Math.max(left, right);
    }
}

/*
110. Balanced Binary Tree
 */
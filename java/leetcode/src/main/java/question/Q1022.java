package question;

import annotation.BinaryTree;
import annotation.DepthFirstSearch;
import annotation.Tree;
import datastructure.TreeNode;

@Tree
@DepthFirstSearch
@BinaryTree
public class Q1022 {
    /*
    Time Complexity: O(n)   Space Complexity: O(h)
     */
    public int sumRootToLeaf(TreeNode root) {
        return helper(root, 0);
    }

    private int helper(TreeNode root, int val) {
        if (root == null) return 0;

        val = (val << 1) + root.val;

        return (root.left == root.right) ? val : helper(root.left, val) + helper(root.right, val);
    }
}

/*
1022. Sum of Root To Leaf Binary Numbers
 */

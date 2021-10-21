package question;

import annotation.BinaryTree;
import annotation.DepthFirstSearch;
import annotation.Tree;
import datastructure.TreeNode;

@Tree
@DepthFirstSearch
@BinaryTree
public class Q112 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        int newSum = targetSum - root.val;

        if (root.left == null && root.right == null) return newSum == 0;
        return hasPathSum(root.left, newSum) || hasPathSum(root.right, newSum);
    }
}

/*
112. Path Sum
 */
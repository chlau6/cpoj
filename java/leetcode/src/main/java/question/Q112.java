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

        if (root.left == null && root.right == null && targetSum - root.val == 0) return true;
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}

/*
112. Path Sum
 */
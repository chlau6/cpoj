package question;

import annotation.BinaryTree;
import annotation.BreadthFirstSearch;
import annotation.DepthFirstSearch;
import annotation.Tree;
import datastructure.TreeNode;

@Tree
@DepthFirstSearch
@BreadthFirstSearch
@BinaryTree
public class Q101 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);
    }

    public boolean helper(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;

        if (p == null || q == null || p.val != q.val) return false;

        return helper(p.left, q.right) && helper(p.right, q.left);
    }
}

/*
101. Symmetric Tree
 */

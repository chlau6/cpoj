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
public class Q100 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }
}

/*
100. Same Tree
 */

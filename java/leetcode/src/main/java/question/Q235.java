package question;

import annotation.BinarySearchTree;
import annotation.BinaryTree;
import annotation.DepthFirstSearch;
import annotation.Tree;
import datastructure.TreeNode;

@Tree
@DepthFirstSearch
@BinarySearchTree
@BinaryTree
public class Q235 {
    /*
    Time Complexity: O(n)   Space Complexity: O(h)
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        if (root.val > Math.max(p.val, q.val)) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < Math.min(p.val, q.val)) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }
}

/*
235. Lowest Common Ancestor of a Binary Search Tree
 */

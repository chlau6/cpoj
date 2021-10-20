package question;

import annotation.BinaryTree;
import annotation.DepthFirstSearch;
import annotation.Tree;
import company.Facebook;
import datastructure.TreeNode;

@Tree
@DepthFirstSearch
@BinaryTree
@Facebook
public class Q236 {
    /*
    Time Complexity: O(n)   Space Complexity: O(h)
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode leftLCA = lowestCommonAncestor(root.left, p, q);
        TreeNode rightLCR = lowestCommonAncestor(root.right, p, q);

        if (leftLCA != null && rightLCR != null) {
            return root;
        } else if (leftLCA != null) {
            return leftLCA;
        } else {
            return rightLCR;
        }
    }
}

/*
236. Lowest Common Ancestor of a Binary Tree
 */
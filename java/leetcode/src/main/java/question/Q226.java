package question;

import annotation.BinarySearch;
import annotation.BreadthFirstSearch;
import annotation.DepthFirstSearch;
import annotation.Tree;
import company.Facebook;
import datastructure.TreeNode;

@Tree
@DepthFirstSearch
@BreadthFirstSearch
@BinarySearch
@Facebook
public class Q226 {
    /*
    Time Complexity: O(n)   Space Complexity: O(h)
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;

        return root;
    }
}

/*
226. Invert Binary Tree
 */

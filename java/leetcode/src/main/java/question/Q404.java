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
public class Q404 {
    /*
    Time Complexity: O(n)  Space Complexity: O(h)
     */
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.val + sumOfLeftLeaves(root.right);
        }

        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}

/*
404. Sum of Left Leaves
 */

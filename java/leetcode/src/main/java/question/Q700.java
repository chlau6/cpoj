package question;

import datastructure.TreeNode;

public class Q700 {
    /*
    Time Complexity: O(log n)   Space Complexity: O(log n)
     */
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;

        if (root.val == val) {
            return root;
        } else if (root.val > val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }
}

/*
700. Search in a Binary Search Tree
 */

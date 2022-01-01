package question;

import datastructure.TreeNode;

public class Q938 {
    /*
    ping:   Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        if (root.val < low) return rangeSumBST(root.right, low, high);
        if (root.val > high) return rangeSumBST(root.left, low, high);

        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}

/*
938. Range Sum of BST
 */

package question;

import datastructure.TreeNode;

public class Q563 {
    /*
    Time Complexity: O(n)   Space Complexity: O(h)
     */
    Integer sum = 0;

    public int findTilt(TreeNode root) {
        postorder(root);

        return sum;
    }

    public int postorder(TreeNode root) {
        if (root == null) return 0;

        int left = postorder(root.left);
        int right = postorder(root.right);

        sum += Math.abs(left - right);

        return left + right + root.val;
    }
}

/*
563. Binary Tree Tilt
 */

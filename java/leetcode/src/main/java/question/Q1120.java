package question;

import company.Facebook;
import datastructure.TreeNode;

@Facebook
public class Q1120 {
    /*
    Time Complexity: O(n)   Space Complexity: O(h)
     */
    double maxAverage = 0.0;

    public double maximumAverageSubtree(TreeNode root) {
        helper(root);
        return maxAverage;
    }

    private int[] helper(TreeNode root) {
        int[] data = new int[2];
        if (root == null) {
            return data;
        }

        int[] left = helper(root.left);
        int[] right = helper(root.right);

        data[0] = left[0] + right[0] + root.val;
        data[1] = left[1] + right[1] + 1;

        maxAverage = Math.max(maxAverage, (double) data[0] / data[1]);
        return data;
    }
}

/*
1120. Maximum Average Subtree
 */

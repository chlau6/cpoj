package question;

import datastructure.TreeNode;

public class Q108 {
    /*
    Time Complexity: O(n)   Space Complexity: O(log n)
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;

        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int start, int end) {
        if (start > end) return null;

        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, start, mid - 1);
        node.right = helper(nums, mid + 1, end);

        return node;
    }
}

/*
108. Convert Sorted Array to Binary Search Tree
 */
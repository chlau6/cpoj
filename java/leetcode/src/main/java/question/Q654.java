package question;

import datastructure.TreeNode;

public class Q654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    public TreeNode dfs(int[] nums, int i, int j) {
        if (i > j) return null;

        int maxIndex = i;

        for (int k = i; k <= j; k++) {
            if (nums[k] > nums[maxIndex]) {
                maxIndex = k;
            }
        }

        TreeNode node = new TreeNode(nums[maxIndex]);
        node.left = dfs(nums, i, maxIndex - 1);
        node.right = dfs(nums, maxIndex + 1, j);

        return node;
    }
}

/*
654. Maximum Binary Tree
 */

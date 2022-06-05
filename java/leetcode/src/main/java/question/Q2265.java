package question;

import datastructure.TreeNode;

public class Q2265 {
    int result = 0;

    public int averageOfSubtree(TreeNode root) {
        dfs(root);

        return result;
    }

    public int[] dfs(TreeNode root) {
        if (root == null) return new int[]{0, 0};

        int[] left = dfs(root.left);
        int[] right = dfs(root.right);

        int sum = root.val + left[0] + right[0];
        int node = 1 + left[1] + right[1];

        int average = sum / node;

        if (average == root.val) {
            result++;
        }

        return new int[]{sum, node};
    }
}

/*
2265. Count Nodes Equal to Average of Subtree
 */

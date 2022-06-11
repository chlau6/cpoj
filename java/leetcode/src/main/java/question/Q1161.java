package question;

import datastructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Q1161 {
    public int maxLevelSum(TreeNode root) {
        int result = 0;
        int maxSum = Integer.MIN_VALUE;
        int level = 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            int sum = 0;
            level++;

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                sum += node.val;

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }

            if (sum > maxSum) {
                maxSum = sum;
                result = level;
            }
        }

        return result;
    }
}

/*
1161. Maximum Level Sum of a Binary Tree
 */

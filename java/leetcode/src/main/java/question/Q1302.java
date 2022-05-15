package question;

import datastructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Q1302 {
    public int deepestLeavesSum(TreeNode root) {
        int result = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();
            int sum = 0;

            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                sum += node.val;

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }

            result = sum;
        }

        return result;
    }
}

/*
1302. Deepest Leaves Sum
 */

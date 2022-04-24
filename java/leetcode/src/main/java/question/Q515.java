package question;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q515 {
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<Integer> result = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();
            int rowMax = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();

                rowMax = Math.max(rowMax, node.val);

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }

            result.add(rowMax);
        }

        return result;
    }
}

/*
515. Find Largest Value in Each Tree Row
 */
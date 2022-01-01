package question;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q637 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<Double> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            double sum = 0;
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                sum += node.val;

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }

            result.add(sum / size);
        }

        return result;
    }
}

/*
637. Average of Levels in Binary Tree
 */

package question;

import datastructure.TreeNode;

import java.util.*;

public class Q107 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int n = queue.size();

            for (int i = 0; i < n; i++) {
                TreeNode node = queue.remove();

                level.add(node.val);

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            result.add(level);
        }

        Collections.reverse(result);

        return result;
    }
}

/*
107. Binary Tree Level Order Traversal II
 */
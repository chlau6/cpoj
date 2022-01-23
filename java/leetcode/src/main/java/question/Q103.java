package question;

import datastructure.TreeNode;

import java.util.*;

public class Q103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        boolean isReverse = false;

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

            if (isReverse) Collections.reverse(level);

            result.add(level);
            isReverse = !isReverse;
        }

        return result;
    }
}

/*
103. Binary Tree Zigzag Level Order Traversal
 */

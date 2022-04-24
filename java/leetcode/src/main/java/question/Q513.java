package question;

import datastructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Q513 {
    int maxDepth = 0;
    int result = 0;

    /*
    DFS
     */
    public int findBottomLeftValue(TreeNode root) {
        result = root.val;
        dfs(root, 1);

        return result;
    }

    public void dfs(TreeNode root, int depth) {
        if (root == null) return;

        if (depth > maxDepth) {
            maxDepth = depth;
            result = root.val;
        }

        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }

    /*
    BFS
     */
    public int findBottomLeftValue2(TreeNode root) {
        int result = 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();

            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();

                if (i == 0) {
                    result = node.val;
                }

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }
        }

        return result;
    }
}

/*
513. Find Bottom Left Tree Value
 */
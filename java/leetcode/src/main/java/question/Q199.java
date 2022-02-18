package question;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q199 {
    /*
    DFS
     */
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        dfs(result, root, 0);

        return result;
    }

    public void dfs(List<Integer> result, TreeNode root, int level) {
        if (root == null) return;

        if (level >= result.size()) {
            result.add(root.val);
        }

        dfs(result, root.right, level + 1);
        dfs(result, root.left, level + 1);
    }

    /*
    BFS
     */
    public List<Integer> rightSideView2(TreeNode root) {
        if (root == null) return new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int n = queue.size();

            for (int i = 0; i < n; i++) {
                TreeNode node = queue.remove();

                if (i == 0) result.add(node.val);
                if (node.right != null) queue.add(node.right);
                if (node.left != null) queue.add(node.left);
            }
        }

        return result;
    }
}

/*
199. Binary Tree Right Side View
 */

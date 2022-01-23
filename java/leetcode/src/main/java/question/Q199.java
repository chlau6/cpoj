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
        List<Integer> ans = new ArrayList<>();

        dfs(ans, 1, root);

        return ans;
    }

    private void dfs(List<Integer> list, int level, TreeNode root) {
        if (root == null) return;

        if (level > list.size()) {
            list.add(root.val);
        }

        dfs(list, level + 1, root.right);
        dfs(list, level + 1, root.left);
    }

    /*
    BFS
     */
    public List<Integer> rightSideView2(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                if (i == 0) ans.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        return ans;
    }
}

/*
199. Binary Tree Right Side View
 */

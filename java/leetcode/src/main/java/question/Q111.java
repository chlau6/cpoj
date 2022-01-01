package question;

import datastructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class    Q111 {
    /*
    Time Complexity: O(n)   Space Complexity: O(w)
     */
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        int depth = 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            depth++;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if (node.left == null && node.right == null) {
                    return depth;
                }
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
        }

        return depth;
    }

    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int minDepth2(TreeNode root) {
        if (root == null) return 0;

        if (root.left == null) return 1 + minDepth(root.right);
        if (root.right == null) return 1 + minDepth(root.left);

        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}

/*
111. Minimum Depth of Binary Tree
 */
package question;

import datastructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Q993 {
    /*
    DFS
     */
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            boolean xFound = false;
            boolean yFound = false;
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if (!xFound) {
                    xFound = node.val == x;
                }

                if (!yFound) {
                    yFound = node.val == y;
                }

                if (node.left != null && node.right != null && (node.left.val == x && node.right.val == y || node.left.val == y && node.right.val == x)) {
                    return false;
                }

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }

            if (xFound && yFound) return true;

            if (xFound || yFound) return false;
        }

        return false;
    }
}

/*
993. Cousins in Binary Tree
 */

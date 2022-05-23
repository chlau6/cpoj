package question;

import datastructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Q623 {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newNode = new TreeNode(val);
            newNode.left = root;
            return newNode;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        for (int i = 0; i < depth - 2; i++) {
            int size = q.size();

            for (int j = 0; j < size; j++) {
                TreeNode node = q.poll();

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }
        }

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                TreeNode newLeft = new TreeNode(val);
                TreeNode newRight = new TreeNode(val);

                newLeft.left = node.left;
                newRight.right = node.right;

                node.left = newLeft;
                node.right = newRight;
            }
        }

        return root;
    }
}

/*
623. Add One Row to Tree
 */

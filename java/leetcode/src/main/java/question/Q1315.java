package question;

import datastructure.TreeNode;

public class Q1315 {
    int sum = 0;

    public int sumEvenGrandparent(TreeNode root) {
        dfs(root, null, null);

        return sum;
    }

    public void dfs(TreeNode node, TreeNode grandparent, TreeNode parent) {
        if (node == null) return;

        if (grandparent != null && grandparent.val % 2 == 0) {
            sum += node.val;
        }

        dfs(node.left, parent, node);
        dfs(node.right, parent, node);
    }
}

/*
1315. Sum of Nodes with Even-Valued Grandparent
 */

package question;

import datastructure.TreeNode;

public class Q1008 {
    int i = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        return dfs(preorder, Integer.MAX_VALUE);
    }

    public TreeNode dfs(int[] preorder, int max) {
        if (i >= preorder.length || preorder[i] >= max) return null;

        TreeNode node = new TreeNode(preorder[i++]);
        node.left = dfs(preorder, node.val);
        node.right = dfs(preorder, max);

        return node;
    }
}

/*
1008. Construct Binary Search Tree from Preorder Traversal
 */

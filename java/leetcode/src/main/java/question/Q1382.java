package question;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q1382 {
    public TreeNode balanceBST(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();

        inorder(list, root);

        return construct(list, 0, list.size() - 1);
    }

    public void inorder(List<TreeNode> list, TreeNode root) {
        if (root == null) return;

        inorder(list, root.left);

        list.add(root);

        inorder(list, root.right);
    }

    public TreeNode construct(List<TreeNode> list, int i, int j) {
        if (i > j) return null;

        int mid = (i + j) / 2;

        TreeNode node = list.get(mid);
        node.left = construct(list, i, mid - 1);
        node.right = construct(list, mid + 1, j);

        return node;
    }
}

/*
1382. Balance a Binary Search Tree
 */

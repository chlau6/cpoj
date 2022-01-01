package question;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q501 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    int count = 1;
    int max = 0;
    TreeNode prev = null;

    public int[] findMode(TreeNode root) {
        TreeNode prev = null;
        List<Integer> list = new ArrayList<>();

        inorder(root, list);

        int[] result = new int[list.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public void inorder(TreeNode node, List<Integer> list) {
        if (node == null) return;

        inorder(node.left, list);

        if (prev != null) {
            count = (node.val == prev.val) ? count + 1 : 1;
        }

        if (count >= max) {
            if (count > max) list.clear();

            list.add(node.val);
            max = count;
        }

        prev = node;
        inorder(node.right, list);
    }
}

/*
501. Find Mode in Binary Search Tree
 */

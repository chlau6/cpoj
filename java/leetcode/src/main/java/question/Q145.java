package question;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q145 {
    /*
    Recursion
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        helper(root, list);

        return list;
    }

    public void helper(TreeNode root, List<Integer> list) {
        if (root == null) return;

        helper(root.left, list);
        helper(root.right, list);
        list.add(root.val);
    }
}

/*
144. Binary Tree Preorder Traversal
 */

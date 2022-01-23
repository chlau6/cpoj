package question;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q98 {
    /*
    Stack
     */
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();

        TreeNode prev = null;
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();

            if (prev != null && prev.val >= curr.val) return false;

            prev = curr;
            curr = curr.right;
        }

        return true;
    }

    /*
    Recursion
     */
    public boolean isValidBST2(TreeNode root) {
        if (root == null) return true;

        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode root, long low, long high) {
        if (root == null) return true;
        if (root.val <= low || root.val >= high) return false;
        return validate(root.left, low, root.val) && validate(root.right, root.val, high);
    }

    /*
    Recursion + List
     */
    public boolean isValidBST3(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        dfs(root, list);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }

        return true;
    }

    private void dfs(TreeNode root, List<Integer> list) {
        if (root == null) return;

        dfs(root.left, list);

        list.add(root.val);

        dfs(root.right, list);
    }
}

/*
98. Validate Binary Search Tree
 */

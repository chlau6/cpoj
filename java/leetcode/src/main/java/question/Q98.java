package question;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q98 {
    /*
    Recursion
    Time Complexity: O(n)   Space Complexity: O(h)
     */
    public boolean isValidBST(TreeNode root) {
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
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public boolean isValidBST2(TreeNode root) {
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

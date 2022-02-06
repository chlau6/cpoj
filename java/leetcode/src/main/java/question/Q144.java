package question;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q144 {
    /*
    Recursion
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        helper(root, list);

        return list;
    }

    public void helper(TreeNode root, List<Integer> list) {
        if (root == null) return;

        list.add(root.val);
        helper(root.left, list);
        helper(root.right, list);
    }

    /*
    Iteration
     */
    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        TreeNode t = root;

        while (!stack.empty() || root != null) {
            if (root != null) {
                list.add(root.val);
                stack.push(root);
                t = t.left;
            } else {
                t = stack.pop();
                t = t.right;
            }
        }
        return list;
    }
}

/*
144. Binary Tree Preorder Traversal
 */

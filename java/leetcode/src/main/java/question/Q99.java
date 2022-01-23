package question;

import datastructure.TreeNode;

import java.util.Stack;

public class Q99 {
    /*
    Stack
    Time Complexity: O(n)   Space Complexity: O(h)
     */
    public void recoverTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();

        TreeNode first = null;
        TreeNode second = null;

        TreeNode prev = null;
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();

            if (prev != null && prev.val > curr.val) {
                if (first == null) {
                    first = prev;
                }

                second = curr;
            }

            prev = curr;
            curr = curr.right;
        }

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
}

/*
99. Recover Binary Search Tree
 */

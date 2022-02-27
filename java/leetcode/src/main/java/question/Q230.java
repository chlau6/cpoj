package question;

import datastructure.TreeNode;

import java.util.Stack;

public class Q230 {
    /*
    DFS
     */
    int count = 0;
    int result = 0;

    public int kthSmallest(TreeNode root, int k) {
        count = k;

        dfs(root);

        return result;
    }

    public void dfs(TreeNode root) {
        if (root.left != null) {
            dfs(root.left);
        }

        count--;

        if (count == 0) {
            result = root.val;
            return;
        }

        if (root.right != null) {
            dfs(root.right);
        }
    }

    /*
    Stack
     */
    public int kthSmallest2(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();

        while (root != null) {
            stack.push(root);
            root = root.left;
        }

        while (k != 0) {
            TreeNode node = stack.pop();
            k--;

            if (k == 0) return node.val;

            TreeNode child = node.right;

            while (child != null) {
                stack.push(child);
                child = child.left;
            }
        }

        return -1;
    }
}

/*
230. Kth Smallest Element in a BST
 */

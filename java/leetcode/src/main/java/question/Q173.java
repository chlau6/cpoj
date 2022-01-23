package question;

import datastructure.TreeNode;

import java.util.Stack;

public class Q173 {
    class BSTIterator {
        Stack<TreeNode> stack = new Stack<>();

        public BSTIterator(TreeNode root) {
            push(root);
        }

        public int next() {
            TreeNode treeNode = stack.pop();
            push(treeNode.right);

            return treeNode.val;
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }

        private void push(TreeNode root) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
        }
    }
}

/*
173. Binary Search Tree Iterator
 */
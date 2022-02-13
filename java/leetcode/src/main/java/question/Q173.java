package question;

import datastructure.TreeNode;

import java.util.Stack;

public class Q173 {
    class BSTIterator {
        Stack<TreeNode> stack = new Stack<>();

        public BSTIterator(TreeNode root) {
            pushAll(root);
        }

        public int next() {
            TreeNode node = stack.pop();
            pushAll(node.right);

            return node.val;
        }

        public boolean hasNext() {
            return !stack.empty();
        }

        public void pushAll(TreeNode root) {
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
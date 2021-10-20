package question;

import annotation.*;
import company.Facebook;
import datastructure.TreeNode;

import java.util.Stack;

@Stacks
@Tree
@Design
@BinarySearchTree
@BinaryTree
@Iterators
@Facebook
public class Q173 {
    /*
    Time Complexity: O(n)   Space Complexity: O(h)
     */
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
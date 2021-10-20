package question;

import annotation.BinarySearchTree;
import annotation.BinaryTree;
import annotation.DivideAndConquer;
import annotation.LinkedLists;
import datastructure.TreeNode;

@BinarySearchTree
@LinkedLists
@BinaryTree
@DivideAndConquer
public class Q426 {
    TreeNode prev = null;
    TreeNode head = null;
    public TreeNode treeToDoublyList(TreeNode root) {
        if (root == null) return null;

        inorder(root);

        prev.right = head;
        head.left = prev;
        return head;
    }

    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);

        if (head == null) {
            head = root;
        } else {
            prev.right = root;
            root.left = prev;
        }

        prev = root;
        inorder(root.right);
    }
}

/*
426. Convert Binary Search Tree to Sorted Doubly Linked List
 */

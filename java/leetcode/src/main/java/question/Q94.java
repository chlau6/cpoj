package question;

import annotation.BinarySearch;
import annotation.DepthFirstSearch;
import annotation.Stacks;
import annotation.Tree;
import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

@Stacks
@Tree
@DepthFirstSearch
@BinarySearch
public class Q94 {
    /*
    Time Complexity: O(n)   Space Complexity: O(h)
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        inorder(root, list);

        return list;
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}

/*
94. Binary Tree Inorder Traversal
 */

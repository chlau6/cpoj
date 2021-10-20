package question;

import annotation.*;
import datastructure.TreeNode;

import java.util.HashMap;
import java.util.Map;

@Array
@HashTable
@DivideAndConquer
@Tree
@BinaryTree
public class Q106 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    int postPos;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postPos = postorder.length - 1;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return helper(postorder, map, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] postorder, Map<Integer, Integer> map, int inStart, int inEnd) {
        if (inStart > inEnd) return null;

        TreeNode root = new TreeNode(postorder[postPos]);
        int inPos = map.get(postorder[postPos]);
        postPos--;

        root.right = helper(postorder, map, inPos + 1, inEnd);
        root.left = helper(postorder, map, inStart, inPos - 1);

        return root;
    }
}

/*
106. Construct Binary Tree from Inorder and Postorder Traversal
 */
package question;

import annotation.*;
import company.Facebook;
import datastructure.TreeNode;

import java.util.HashMap;
import java.util.Map;

@Array
@HashTable
@DivideAndConquer
@Tree
@BinaryTree
@Facebook
public class Q105 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    int prePos = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return helper(preorder, map, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] preorder, Map<Integer, Integer> map, int inStart, int inEnd) {
        if (inStart > inEnd) return null;

        TreeNode root = new TreeNode(preorder[prePos]);
        int inPos = map.get(preorder[prePos]);

        prePos++;

        root.left = helper(preorder, map, inStart, inPos - 1);
        root.right = helper(preorder, map, inPos + 1, inEnd);

        return root;
    }
}

/*
105. Construct Binary Tree from Preorder and Inorder Traversal
 */

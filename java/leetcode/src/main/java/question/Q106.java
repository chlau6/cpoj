package question;

import datastructure.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Q106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = postorder.length;

        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }

        return recursion(map, inorder, postorder, n - 1, 0, n - 1);
    }

    private TreeNode recursion(Map<Integer, Integer> map, int[] inorder, int[] postorder, int post, int inStart, int inEnd) {
        if (inStart > inEnd) return null;

        int in = map.get(postorder[post]);

        TreeNode root = new TreeNode(postorder[post]);
        root.left = recursion(map, inorder, postorder, post - (inEnd - in) - 1, inStart, in - 1);
        root.right = recursion(map, inorder, postorder, post - 1, in + 1, inEnd);

        return root;
    }
}

/*
106. Construct Binary Tree from Inorder and Postorder Traversal
 */
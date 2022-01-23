package question;

import datastructure.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Q105 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = inorder.length;

        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }

        return recursion(map, preorder, inorder, 0, 0, n - 1);
    }

    private TreeNode recursion(Map<Integer, Integer> map, int[] preorder, int[] inorder, int pre, int inStart, int inEnd) {
        if (inStart > inEnd) return null;

        int in = map.get(preorder[pre]);

        TreeNode root = new TreeNode(preorder[pre]);
        root.left = recursion(map, preorder, inorder, pre + 1, inStart, in - 1);
        root.right = recursion(map, preorder, inorder, pre + in - inStart + 1, in + 1, inEnd);

        return root;
    }
}

/*
105. Construct Binary Tree from Preorder and Inorder Traversal
 */

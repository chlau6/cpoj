package question;

import datastructure.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Q543 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        Map<TreeNode, Integer> depthMap = new HashMap<>();
        maxDepth(root, depthMap);

        return diameter;
    }

    private int maxDepth(TreeNode root, Map<TreeNode, Integer> depthMap) {
        if (root == null) return 0;
        if (depthMap.containsKey(root)) return depthMap.get(root);
        int left = maxDepth(root.left, depthMap);
        int right = maxDepth(root.right, depthMap);

        diameter = Math.max(diameter, left + right);

        int depth = Math.max(left, right) + 1;
        depthMap.put(root, depth);
        return depth;
    }
}

/*
543. Diameter of Binary Tree
 */

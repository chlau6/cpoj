package question;

import datastructure.TreeNode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q1676 {
    /*
    Time Complexity: O(log n)   Space Complexity: O(1)
     */
    public TreeNode lowestCommonAncestor(TreeNode root, List<TreeNode> nodes) {
        Set<TreeNode> set = new HashSet<>(nodes);
        return helper(root, set);
    }

    private TreeNode helper(TreeNode root, Set<TreeNode> set) {
        if (root == null) return null;

        if (set.contains(root)) {
            return root;
        }

        TreeNode leftLCA = helper(root.left, set);
        TreeNode rightLCA = helper(root.right, set);

        if (leftLCA != null && rightLCA != null) {
            return root;
        } else if (leftLCA != null) {
            return leftLCA;
        } else {
            return rightLCA;
        }
    }
}

/*
1644. Lowest Common Ancestor of a Binary Tree II
 */

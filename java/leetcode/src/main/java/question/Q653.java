package question;

import annotation.*;
import datastructure.TreeNode;

import java.util.HashSet;
import java.util.Set;

@HashTable
@TwoPointers
@Tree
@DepthFirstSearch
@BreadthFirstSearch
@BinarySearchTree
@BinaryTree
public class Q653 {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();

        return dfs(root, set, k);
    }

    public boolean dfs(TreeNode node, Set<Integer> set, int k) {
        if (node == null) return false;

        if (set.contains(k - node.val)) return true;

        set.add(node.val);

        return dfs(node.left, set, k) || dfs(node.right, set, k);
    }

    /*
    variation: find two numbers in the tree that sums up to n
     */
    public int[] twoSum(TreeNode root, int n) {
        Set<Integer> set = new HashSet<>();
        int[] ans = dfs2(root, set, n);

        return ans;
    }

    public int[] dfs2(TreeNode node, Set<Integer> set, int n) {
        if (node == null) return null;

        set.add(node.val);

        int[] left = dfs2(node.left, set, n);

        if (set.contains(n - node.val)) {
            int[] ans = new int[2];
            ans[0] = node.val;
            ans[1] = n - node.val;

            return ans;
        }

        int[] right = dfs2(node.right, set, n);
        return left == null ? right : left;
    }

    /*
    variation: find two numbers in the tree that sums up to n in O(1) space //  https://leetcode.com/problems/two-sum-iv-input-is-a-bst/discuss/106060/O(N)-TIME-O(1)-SPACE // TODO
     */
}

/*
653. Two Sum IV - Input is a BST
 */

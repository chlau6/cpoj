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
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
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
}

/*
653. Two Sum IV - Input is a BST
 */

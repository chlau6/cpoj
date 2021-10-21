package question;

import annotation.BinarySearchTree;
import annotation.DepthFirstSearch;
import annotation.Strings;
import annotation.Tree;
import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

@Strings
@Tree
@DepthFirstSearch
@BinarySearchTree
public class Q257 {
    /*
    Time Complexity: O(n)   Space Complexity: O(h)
     */
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<String> list = new ArrayList<>();

        helper(root, list, "");

        return list;
    }

    public void helper(TreeNode root, List<String> list, String path) {
        if (root.left == null && root.right == null) {
            list.add(path + root.val);
            return;
        }

        String newPath = path + root.val + "->";

        if (root.left != null) helper(root.left, list, newPath);

        if (root.right != null) helper(root.right, list, newPath);
    }
}

/*
257. Binary Tree Paths
 */
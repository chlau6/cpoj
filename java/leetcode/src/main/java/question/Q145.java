
package question;

import annotation.BinaryTree;
import annotation.DepthFirstSearch;
import annotation.Stacks;
import annotation.Tree;
import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

@Stacks
@Tree
@DepthFirstSearch
@BinaryTree
public class Q145 {
    /*
    Recursion
    Time Complexity: O(n)   Space Complexity: O(h)
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        helper(root, list);

        return list;
    }

    public void helper(TreeNode root, List<Integer> list) {
        if (root == null) return;

        helper(root.left, list);
        helper(root.right, list);
        list.add(root.val);
    }
}

/*
144. Binary Tree Preorder Traversal
 */

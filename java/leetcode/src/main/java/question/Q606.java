package question;

import annotation.BinaryTree;
import annotation.DepthFirstSearch;
import annotation.Strings;
import annotation.Tree;
import datastructure.TreeNode;

@Strings
@Tree
@DepthFirstSearch
@BinaryTree
public class Q606 {
    /*
    Time Complexity: O(n^2)   Space Complexity: O(n^2)
     */
    public String tree2str(TreeNode root) {
        if (root == null) return "";

        String result = String.valueOf(root.val);

        if (root.left == null && root.right == null) return result;

        result += "(" + tree2str(root.left) + ")";

        if (root.right != null) {
            result += "(" + tree2str(root.right) + ")";
        }

        return result;
    }
}

/*
606. Construct String from Binary Tree
 */

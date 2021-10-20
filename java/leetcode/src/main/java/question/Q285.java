package question;

import company.Facebook;
import datastructure.TreeNode;

@Facebook
public class Q285 {
    /*
    Time Complexity: O(log n)   Space Complexity: O(1)
     */
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode successor = null;

        while (root != null) {
            if (root.val > p.val) {
                successor = root;
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return successor;
    }
}

/*
285. Inorder Successor in BST
 */

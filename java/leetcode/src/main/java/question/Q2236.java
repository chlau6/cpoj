
package question;

import datastructure.TreeNode;

public class Q2236 {
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}

/*
2236. Root Equals Sum of Children
 */

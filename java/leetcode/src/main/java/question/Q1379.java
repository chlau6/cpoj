package question;

import datastructure.TreeNode;

public class Q1379 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null || original == target) {
            return cloned;
        }

        TreeNode result = getTargetCopy(original.left, cloned.left, target);

        if (result != null) {
            return result;
        }

        return result = getTargetCopy(original.right, cloned.right, target);
    }
}

/*
1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree
 */

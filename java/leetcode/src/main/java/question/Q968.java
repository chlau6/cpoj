package question;

import datastructure.TreeNode;

public class Q968 {
    int result = 0;

    public int minCameraCover(TreeNode root) {
        Type type = dfs(root);

        if (type == Type.LEAF) {
            result++;
        }

        return result;
    }

    public Type dfs(TreeNode root) {
        if (root == null) return Type.COVERED;

        Type left = dfs(root.left);
        Type right = dfs(root.right);

        if (left == Type.LEAF || right == Type.LEAF) {
            result++;
            return Type.PARENT;
        }

        return left == Type.PARENT || right == Type.PARENT ? Type.COVERED : Type.LEAF;
    }

    enum Type {
        COVERED,
        LEAF,
        PARENT
    }
}

/*
968. Binary Tree Cameras
 */

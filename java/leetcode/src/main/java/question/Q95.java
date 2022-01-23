package question;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q95 {
    public List<TreeNode> generateTrees(int n) {
        return recursion(1, n);
    }

    public List<TreeNode> recursion(int start, int end) {
        List<TreeNode> result = new ArrayList<>();

        if (start > end) {
            result.add(null);
            return result;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> left = recursion(start, i - 1);
            List<TreeNode> right = recursion(i + 1, end);

            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode node = new TreeNode(i);
                    node.left = l;
                    node.right = r;
                    result.add(node);
                }
            }
        }

        return result;
    }
}

/*
95. Unique Binary Search Trees II
 */

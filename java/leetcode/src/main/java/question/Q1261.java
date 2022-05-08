package question;

import datastructure.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class Q1261 {
    class FindElements {
        Set<Integer> set = new HashSet<>();

        public FindElements(TreeNode root) {
            dfs(root, 0);
        }

        public boolean find(int target) {
            return set.contains(target);
        }

        public void dfs(TreeNode root, int val) {
            if (root == null) return;

            set.add(val);

            dfs(root.left, 2 * val + 1);
            dfs(root.right, 2 * val + 2);
        }
    }

}

/*
1260. Shift 2D Grid
 */

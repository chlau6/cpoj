package question;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();

        dfs(result, new ArrayList<>(), root, targetSum);

        return result;
    }

    public void dfs(List<List<Integer>> result, List<Integer> list, TreeNode root, int targetSum) {
        if (root == null) return;

        list.add(root.val);
        int newSum = targetSum - root.val;

        if (root.left == null && root.right == null && newSum == 0) {
            result.add(new ArrayList<>(list));
        }

        dfs(result, list, root.left, newSum);
        dfs(result, list, root.right, newSum);

        list.remove(list.size() - 1);
    }
}

/*
113. Path Sum II
 */
package question;

import datastructure.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Q437 {
    /*
    Prefix Sum
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        return dfs(root, map, 0, targetSum);
    }

    private int dfs(TreeNode root, Map<Integer, Integer> map, int sum, int targetSum) {
        if (root == null) return 0;

        // update the prefix sum by adding the current val
        sum += root.val;
        // get the number of valid path, ended by the current node
        int ans = map.getOrDefault(sum - targetSum, 0);

        // update the map with the current sum, so the map is good to be passed to the next recursion
        map.put(sum, map.getOrDefault(sum, 0) + 1);

        ans += dfs(root.left, map, sum, targetSum) + dfs(root.right, map, sum, targetSum);

        // restore the map, as the recursion goes from the bottom to the top
        map.put(sum, map.get(sum) - 1);

        return ans;
    }

    /*
    DFS
    Time Complexity: O(n^2)    Space Complexity: O(n)
     */
    public int pathSum2(TreeNode root, int targetSum) {
        if (root == null) return 0;

        return sumUp(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    private int sumUp(TreeNode root, int targetSum) {
        if (root == null) return 0;

        return (targetSum == root.val ? 1 : 0) + sumUp(root.left, targetSum - root.val) + sumUp(root.right, targetSum - root.val);
    }
}

/*
437. Path Sum III
 */

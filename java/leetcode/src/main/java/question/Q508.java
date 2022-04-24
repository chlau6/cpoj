package question;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q508 {
    int maxCount = 0;

    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();

        dfs(map, root);

        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                result.add(entry.getKey());
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    public int dfs(Map<Integer, Integer> map, TreeNode root) {
        if (root == null) return 0;

        int sum = root.val;

        sum += dfs(map, root.left);
        sum += dfs(map, root.right);

        map.compute(sum, (k, v) -> v == null ? 1 : v + 1);
        maxCount = Math.max(maxCount, map.get(sum));

        return sum;
    }
}

/*
508. Most Frequent Subtree Sum
 */
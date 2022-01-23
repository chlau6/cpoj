package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[n];

        Arrays.sort(nums);

        dfs(result, list, nums, visited, 0, n);

        return result;
    }

    public void dfs(List<List<Integer>> result, List<Integer> list, int[] nums, boolean[] visited, int start, int n) {
        result.add(new ArrayList<>(list));

        for (int i = start; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;

            visited[i] = true;
            list.add(nums[i]);

            dfs(result, list, nums, visited, i + 1, n);

            visited[i] = false;
            list.remove(list.size() - 1);
        }
    }
}

/*
90. Subsets II
 */

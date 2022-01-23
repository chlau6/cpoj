package question;

import java.util.ArrayList;
import java.util.List;

public class Q78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        dfs(result, new ArrayList<>(), nums, 0, nums.length);

        return result;
    }

    public void dfs(List<List<Integer>> result, List<Integer> list, int[] nums, int start, int n) {
        result.add(new ArrayList<>(list));

        for (int i = start; i < n; i++) {
            list.add(nums[i]);

            dfs(result, list, nums, i + 1, n);

            list.remove(list.size() - 1);
        }
    }
}

/*
78. Subsets
 */

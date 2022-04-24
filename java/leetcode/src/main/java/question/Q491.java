package question;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q491 {
    public List<List<Integer>> findSubsequences(int[] nums) {
        int n = nums.length;

        List<List<Integer>> result = new ArrayList<>();

        dfs(result, new ArrayList<>(), nums, 0);


        return result;
    }

    public void dfs(List<List<Integer>> result, List<Integer> list, int[] nums, int index) {
        if (list.size() > 1) {
            result.add(new ArrayList<>(list));
        }

        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        for (int i = index; i < n; i++) {
            if (!list.isEmpty() && nums[i] < list.get(list.size() - 1) || set.contains(nums[i])) continue;

            list.add(nums[i]);
            set.add(nums[i]);

            dfs(result, list, nums, i + 1);

            list.remove(list.size() - 1);
        }
    }
}

/*
491. Increasing Subsequences
 */

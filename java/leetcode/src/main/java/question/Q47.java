package question;

import annotation.Array;
import annotation.Backtracking;

import java.util.ArrayList;
import java.util.List;

@Array
@Backtracking
public class Q47 {
    /*
    Time Complexity: O(n!)   Space Complexity: O(n!)
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];

        helper(ans, new ArrayList<>(), nums, visited);
        return ans;
    }

    private void helper(List<List<Integer>> ans, ArrayList<Integer> list, int[] nums, boolean[] isUsed) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
        }

        for (int i = 0; i < nums.length; i++) {
            if (isUsed[i] || i > 0 && nums[i] == nums[i - 1] && !isUsed[i - 1]) continue;
            list.add(nums[i]);
            isUsed[i] = true;
            helper(ans, list, nums, isUsed);
            list.remove(list.size() - 1);
            isUsed[i] = false;
        }
    }
}

/*
47. Permutations II
 */

package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q47 {
    /*
    Time Complexity: O(n * n!)   Space Complexity: O(n * n!)
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        recursion(result, new ArrayList<>(), nums, new boolean[nums.length]);

        return result;
    }

    public void recursion(List<List<Integer>> result, List<Integer> list, int[] nums, boolean[] isUsed) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (isUsed[i] || i > 0 && nums[i] == nums[i - 1] && !isUsed[i - 1]) continue;

            list.add(nums[i]);
            isUsed[i] = true;

            recursion(result, list, nums, isUsed);

            list.remove(list.size() - 1);
            isUsed[i] = false;
        }
    }
}

/*
47. Permutations II
 */

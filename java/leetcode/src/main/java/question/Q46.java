package question;

import java.util.ArrayList;
import java.util.List;

public class Q46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        recursion(result, new ArrayList<>(), nums, new boolean[nums.length]);

        return result;
    }

    public void recursion(List<List<Integer>> result, List<Integer> list, int[] nums, boolean[] isUsed) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (isUsed[i]) {
                continue;
            }

            list.add(nums[i]);
            isUsed[i] = true;

            recursion(result, list, nums, isUsed);

            list.remove(list.size() - 1);
            isUsed[i] = false;
        }
    }
}

/*
46. Permutations
 */

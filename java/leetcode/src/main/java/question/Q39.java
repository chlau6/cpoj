package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();

        helper(ans, new ArrayList<>(), 0, candidates, target);

        return ans;
    }

    private void helper(List<List<Integer>> ans, ArrayList<Integer> list, int index, int[] candidates, int target) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        } else if (target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (candidates[i] > target) break;

            list.add(candidates[i]);
            helper(ans, list, i, candidates, target - candidates[i]);
            list.remove(list.size() - 1);
        }
    }
}

/*
39. Combination Sum
 */

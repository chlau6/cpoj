package question;

import annotation.Array;
import annotation.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Array
@Backtracking
public class Q40 {
    /*
    Time Complexity: O(2^n) Space Complexity: O(n)
    n = candidates.length
    k = target
     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
            if (i > index && candidates[i] == candidates[i - 1]) continue;

            if (candidates[i] > target) break;

            list.add(candidates[i]);
            helper(ans, list, i + 1, candidates, target - candidates[i]);
            list.remove(list.size() - 1);
        }
    }
}

/*
40. Combination Sum II
 */

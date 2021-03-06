package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);

        recursion(result, new ArrayList<>(), candidates, 0, target);

        return result;
    }

    public void recursion(List<List<Integer>> result, List<Integer> list, int[] candidates, int start, int target) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > target) break;

            list.add(candidates[i]);

            recursion(result, list, candidates, i + 1, target - candidates[i]);

            list.remove(list.size() - 1);
        }
    }
}

/*
40. Combination Sum II
 */

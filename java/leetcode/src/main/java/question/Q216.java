package question;

import annotation.Array;
import annotation.Backtracking;

import java.util.ArrayList;
import java.util.List;

@Array
@Backtracking
public class Q216 {
    /*
    Time Complexity: O(9^k) Space Complexity: O(k)
     */
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();

        helper(ans, new ArrayList<>(), k, 1, n);

        return ans;
    }

    private void helper(List<List<Integer>> ans, ArrayList<Integer> list, int size, int start, int n) {
        if (n == 0 && list.size() == size) {
            ans.add(new ArrayList<>(list));
            return;
        } else if (n < 0 || list.size() > size) {
            return;
        }

        for (int i = start; i <= 9; i++) {
            list.add(i);
            helper(ans, list, size, i + 1, n - i);
            list.remove(list.size() - 1);
        }
    }
}

/*
216. Combination Sum III
 */

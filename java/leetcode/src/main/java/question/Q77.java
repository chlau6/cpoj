package question;

import java.util.ArrayList;
import java.util.List;

public class Q77 {
    /*
    Time Complexity: O(k * C(n, k))   Space Complexity: O(k * C(n, k))
     */
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();

        dfs(result, new ArrayList<>(), 1, n, k);

        return result;
    }

    public void dfs(List<List<Integer>> result, List<Integer> list, int start, int n, int k) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
        }

        for (int i = start; i <= n; i++) {
            list.add(i);

            dfs(result, list, i + 1, n, k);

            list.remove(list.size() - 1);
        }
    }
}

/*
77. Combinations
 */

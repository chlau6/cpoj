package question;

import java.util.ArrayList;
import java.util.List;

public class Q1424 {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int m = nums.size();

        for (int i = 0; i < m; i++) {
            int n = nums.get(i).size();

            for (int j = 0; j < n; j++) {
                if (i + j >= list.size()) {
                    list.add(new ArrayList<>());
                }

                list.get(i + j).add(nums.get(i).get(j));
            }
        }

        for (List<Integer> level : list) {
            int size = level.size();

            for (int i = size - 1; i >= 0; i--) {
                result.add(level.get(i));
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}

/*
1424. Diagonal Traverse II
 */

package question;

import annotation.Array;
import annotation.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

@Array
@DynamicProgramming
public class Q118 {
    /*
    Time Complexity: O(n^2) Space Complexity: O(n^2)
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        ans.add(List.of(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            row.add(1);

            List<Integer> last = ans.get(i - 1);

            for (int j = 1; j < i; j++) {
                row.add(last.get(j) + last.get(j - 1));
            }

            row.add(1);

            ans.add(row);
        }

        return ans;
    }
}

/*
118. Pascal's Triangle
 */

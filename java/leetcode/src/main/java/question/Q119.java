package question;

import annotation.Array;
import annotation.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

@Array
@DynamicProgramming
public class Q119 {
    /*
    Time Complexity: O(n^2) Space Complexity: O(n)
     */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();

        ans.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            for (int j = ans.size() - 1; j > 0; j--) {
                ans.set(j, ans.get(j) + ans.get(j - 1));
            }
            ans.add(1);
        }

        return ans;
    }
}

/*
119. Pascal's Triangle II
 */

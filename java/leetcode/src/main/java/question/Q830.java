package question;

import java.util.ArrayList;
import java.util.List;

public class Q830 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();

        int i = 0;
        int j = 0;
        int length = s.length();

        while (j < length) {
            while (j < length && s.charAt(j) == s.charAt(i)) j++;

            if (j - i >= 3) result.add(List.of(i, j - 1));

            i = j;
        }

        return result;
    }
}

/*
830. Positions of Large Groups
 */

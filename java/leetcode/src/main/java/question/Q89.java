package question;

import java.util.ArrayList;
import java.util.List;

public class Q89 {
    /*
    Time Complexity: O(2^n)   Space Complexity: O(2^n)
     */
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(0);

        for (int i = 0; i < n; i++) {
            int size = result.size();

            for (int j = size - 1; j >= 0; j--) {
                result.add(result.get(j) | 1 << i);
            }
        }

        return result;
    }
}

/*
89. Gray Code
 */
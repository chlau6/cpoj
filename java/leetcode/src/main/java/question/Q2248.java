package question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2248 {
    public List<Integer> intersection(int[][] nums) {
        int n = nums.length;
        int[] count = new int[1001];
        List<Integer> result = new ArrayList<>();

        for (int[] array : nums) {
            for (int num : array) {
                if (++count[num] == n) {
                    result.add(num);
                }
            }
        }

        Collections.sort(result);

        return result;
    }
}

/*
2248. Intersection of Multiple Arrays
 */

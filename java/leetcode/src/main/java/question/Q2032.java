package question;

import java.util.ArrayList;
import java.util.List;

public class Q2032 {
    /*
    Time Complexity: O(l + m + n)   Space Complexity: O(max(l, m, n))
     */
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[][] counts = new int[3][101];

        for (int num : nums1) {
            counts[0][num] = 1;
        }

        for (int num : nums2) {
            counts[1][num] = 1;
        }

        for (int num : nums3) {
            counts[2][num] = 1;
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < 101; i++) {
            if (counts[0][i] + counts[1][i] + counts[2][i] >= 2) {
                result.add(i);
            }
        }

        return result;
    }
}
/*
2032. Two Out of Three
 */

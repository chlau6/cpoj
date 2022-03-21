package question;

import java.util.Arrays;
import java.util.Comparator;

public class Q2094 {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] map = new int[n][2];
        int[] result = new int[k];

        for (int i = 0; i < n; i++) {
            map[i][0] = nums[i];
            map[i][1] = i;
        }

        Arrays.sort(map, Comparator.comparingInt(a -> -a[0]));

        int[][] candidate = Arrays.copyOf(map, k);

        Arrays.sort(candidate, Comparator.comparingInt(a -> a[1]));

        for (int i = 0; i < k; i++) {
            result[i] = candidate[i][0];
        }

        return result;
    }
}
/*
2089. Find Target Indices After Sorting Array
 */

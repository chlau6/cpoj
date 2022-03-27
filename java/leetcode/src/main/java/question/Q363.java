package question;

import java.util.Set;
import java.util.TreeSet;

public class Q363 {
    // https://leetcode.com/problems/max-sum-of-rectangle-no-larger-than-k/discuss/1313721/JavaPython-Sub-problem%3A-Max-Sum-of-Subarray-No-Larger-Than-K-Clean-and-Concise
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            int[] sums = new int[n];

            for (int j = i; j < m; j++) {
                for (int l = 0; l < n; l++) {
                    sums[l] += matrix[j][l];
                }

                result = Math.max(result, maxSumSubarray(sums, k));
            }
        }

        return result;
    }

    public int maxSumSubarray(int[] sums, int k) {
        TreeSet<Integer> treeSet = new TreeSet<>(Set.of(0));
        int result = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int s : sums) {
            currentSum += s;

            Integer ceil = treeSet.ceiling(currentSum - k);

            if (ceil != null) {
                result = Math.max(result, currentSum - ceil);
            }

            treeSet.add(currentSum);
        }

        return result;
    }
}
/*
363. Max Sum of Rectangle No Larger Than K
 */

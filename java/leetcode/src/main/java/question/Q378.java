package question;

import java.util.PriorityQueue;

public class Q378 {
    /*
    Priority Queue
     */
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            pq.add(new int[]{matrix[i][0], i, 0});
        }

        while (--k > 0) {
            int[] root = pq.poll();

            if (root[2] + 1 == n) continue;

            int i = root[1];
            int j = root[2] + 1;
            pq.add(new int[]{matrix[i][j], i, j});
        }

        return pq.poll()[0];
    }

    /*
    Binary Search
     */
    public int kthSmallest2(int[][] matrix, int k) {
        int n = matrix.length;
        int left = matrix[0][0];
        int right = matrix[n - 1][n - 1];

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = searchLessOrEqual(matrix, mid);

            if (count < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public int searchLessOrEqual(int[][] matrix, int target) {
        int n = matrix.length;
        int i = n - 1;
        int j = 0;
        int result = 0;

        while (i >= 0 && j < n) {
            if (matrix[i][j] <= target) {
                result += i + 1;
                j++;
            } else {
                i--;
            }
        }

        return result;
    }
}

/*
378. Kth Smallest Element in a Sorted Matrix
 */

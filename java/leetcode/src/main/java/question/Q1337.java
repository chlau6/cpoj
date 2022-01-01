package question;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q1337 {
    /*
    Time Complexity: O(m log mn)   Space Complexity: O(k)
     */
    public int[] kWeakestRows(int[][] mat, int k) {
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] != b[0] ? b[0] - a[0] : b[1] - a[1]);

        for (int i = 0; i < mat.length; i++) {
            pq.add(new int[] {numOfOne(mat[i]), i});

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] result = new int[k];

        while (!pq.isEmpty()) {
            result[--k] = pq.poll()[1];
        }

        return result;
    }

    public int numOfOne(int[] rows) {
        int left = 0;
        int right = rows.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (rows[mid] == 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }
}

/*
1337. The K Weakest Rows in a Matrix
 */

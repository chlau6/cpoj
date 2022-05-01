package question;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Q1338 {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        int result = 0;
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        Arrays.sort(arr);

        for (int i = 0; i < n; ) {
            int j = i + 1;

            while (j < n && arr[j] == arr[i]) {
                j++;
            }

            pq.add(j - i);

            i = j;
        }

        while (count * 2 < n) {
            result++;
            count += pq.poll();
        }

        return result;
    }
}

/*
1338. Reduce Array Size to The Half
 */

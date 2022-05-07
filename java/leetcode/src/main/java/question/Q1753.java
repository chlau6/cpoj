package question;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q1753 {
    /*
    Recursion
     */
    public int maximumScore(int a, int b, int c) {
        if (a < b) return maximumScore(b, a, c);
        if (b < c) return maximumScore(a, c, b);

        return b == 0 ? 0 : 1 + maximumScore(a - 1, b - 1, c);
    }

    /*
    Heap
     */
    public int maximumScore2(int a, int b, int c) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int result = 0;

        pq.add(a);
        pq.add(b);
        pq.add(c);

        while (pq.size() > 1) {
            int one = pq.poll();
            int two = pq.poll();

            if (--one > 0) {
                pq.add(one);
            }

            if (--two > 0) {
                pq.add(two);
            }

            result++;
        }

        return result;
    }
}

/*
1753. Maximum Score From Removing Stones
 */

package question;

import java.util.PriorityQueue;

public class Q2141 {
    public long maxRunTime(int n, int[] batteries) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        long sum = 0;

        for (int b : batteries) {
            pq.add(b);
            sum += b;
        }

        while (pq.peek() > sum / n) {
            sum -= pq.poll();
            n--;
        }

        return sum / n;
    }
}
/*
2141. Maximum Running Time of N Computers
 */

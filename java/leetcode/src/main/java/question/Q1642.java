package question;

import java.util.PriorityQueue;

public class Q1642 {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = heights.length;

        for (int i = 0; i < n - 1; i++) {
            int diff = heights[i + 1] - heights[i];

            if (diff > 0) {
                pq.add(diff);
            }

            if (pq.size() > ladders) {
                bricks -= pq.poll();
            }

            if (bricks < 0) return i;
        }

        return n - 1;
    }
}

/*
1642. Furthest Building You Can Reach
 */

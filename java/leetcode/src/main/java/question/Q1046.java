package question;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q1046 {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            pq.add(stone);
        }

        while (pq.size() > 1) {
            pq.add(pq.poll() - pq.poll());
        }

        return pq.poll();
    }
}

/*
1046. Last Stone Weight
 */

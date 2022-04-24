package question;

import java.util.PriorityQueue;

public class Q502 {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]); // {capital, profit}
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]); // {profit, capital}

        int n = profits.length;

        for (int i = 0; i < n; i++) {
            minHeap.add(new int[]{capital[i], profits[i]});
        }

        for (int i = 0; i < k; i++) {
            while (!minHeap.isEmpty() && minHeap.peek()[0] <= w) {
                int[] top = minHeap.poll();
                maxHeap.add(new int[]{top[1], top[0]});
            }

            if (maxHeap.isEmpty()) break;

            int[] top = maxHeap.poll();
            w += top[0];
        }

        return w;
    }
}

/*
502. IPO
 */
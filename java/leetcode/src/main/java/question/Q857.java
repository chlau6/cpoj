package question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Q857 {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        List<Worker> workers = new ArrayList<>();
        int n = quality.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int qualitySum = 0;
        double result = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            workers.add(new Worker(wage[i] * 1.0 / quality[i], quality[i]));
        }

        Collections.sort(workers, (a, b) -> Double.compare(a.rate, b.rate));

        for (Worker worker : workers) {
            qualitySum += worker.quality;
            pq.add(worker.quality);

            if (pq.size() > k) {
                qualitySum -= pq.poll();
            }

            if (pq.size() == k) {
                result = Math.min(result, qualitySum * worker.rate);
            }
        }

        return result;
    }

    class Worker {
        double rate;
        int quality;

        public Worker(double rate, int quality) {
            this.rate = rate;
            this.quality = quality;
        }
    }
}

/*
857. Minimum Cost to Hire K Workers
 */

package question;

import java.util.PriorityQueue;

public class Q2102 {
    class SORTracker {
        PriorityQueue<Location> minHeap = new PriorityQueue<>((a, b) -> (a.score == b.score ? b.name.compareTo(a.name) : a.score - b.score));
        PriorityQueue<Location> maxHeap = new PriorityQueue<>((a, b) -> (a.score == b.score ? a.name.compareTo(b.name) : b.score - a.score));
        int count = 0;

        public SORTracker() {

        }

        public void add(String name, int score) {
            minHeap.add(new Location(score, name));

            if (minHeap.size() > 0) {
                maxHeap.add(minHeap.poll());
            }
        }

        public String get() {
            minHeap.add(maxHeap.poll());

            count++;

            return minHeap.peek().name;
        }

        class Location {
            int score;
            String name;

            public Location(int score, String name) {
                this.score = score;
                this.name = name;
            }
        }
    }
}

/*
2102. Sequentially Ordinal Rank Tracker
 */

package question;

import java.util.LinkedList;
import java.util.Queue;

public class Q933 {
    class RecentCounter {
        Queue<Integer> q = new LinkedList<>();

        public RecentCounter() {

        }

        public int ping(int t) {
            q.add(t);

            int last = t - 3000;

            while (q.peek() < last) {
                q.poll();
            }

            return q.size();
        }
    }

}

/*
933. Number of Recent Calls
 */

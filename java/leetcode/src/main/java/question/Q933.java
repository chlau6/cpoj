package question;

import annotation.DataStream;
import annotation.Design;
import annotation.Queues;

import java.util.LinkedList;
import java.util.Queue;

@Design
@Queues
@DataStream
public class Q933 {
    /*
    ping:   Time Complexity: O(n)   Space Complexity: O(n)
     */
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

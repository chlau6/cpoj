
package question;

import annotation.Array;
import annotation.Queues;
import annotation.Simulation;

@Array
@Queues
@Simulation
public class Q2073 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int timeRequiredToBuy(int[] tickets, int k) {
        int result = 0;
        int n = tickets.length;

        for (int i = 0; i < n; i++) {
            result += Math.min(tickets[k] - (i > k ? 1 : 0), tickets[i]);
        }

        return result;
    }
}
/*
2068. Check Whether Two Strings are Almost Equivalent
 */

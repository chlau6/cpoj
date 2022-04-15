package question;

public class Q440 {
    public int findKthNumber(int n, int k) {
        int curr = 1;
        k--;

        while (k > 0) {
            long step = 0;
            long first = curr;
            long last = curr + 1;

            while (first <= n) {
                step += Math.min(n + 1, last) - first;
                first *= 10;
                last *= 10;
            }

            if (step <= k) {
                curr++;
                k -= step;
            } else {
                curr *= 10;
                k--;
            }
        }

        return curr;
    }
}

/*
440. K-th Smallest in Lexicographical Order
 */

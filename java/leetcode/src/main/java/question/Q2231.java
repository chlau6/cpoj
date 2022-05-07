package question;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q2231 {
    public int largestInteger(int num) {
        PriorityQueue<Integer> odd = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> even = new PriorityQueue<>(Collections.reverseOrder());

        String str = String.valueOf(num);
        int n = str.length();

        for (int i = 0; i < n; i++) {
            int digit = str.charAt(i) - '0';

            if (digit % 2 == 0) {
                even.add(digit);
            } else {
                odd.add(digit);
            }
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            result *= 10;
            int digit = str.charAt(i) - '0';

            if (digit % 2 == 0) {
                result += even.poll();
            } else {
                result += odd.poll();
            }
        }

        return result;
    }
}

/*
2231. Largest Number After Digit Swaps by Parity
 */

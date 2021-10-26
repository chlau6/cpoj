package question;

import annotation.BitManipulation;

@BitManipulation
public class Q461 {
    /*
    Time Complexity: O(log n)   Space Complexity: O(1)
     */
    public int hammingDistance(int x, int y) {
        int distance = 0;
        int xor = x ^ y;

        while (xor > 0) {
            if ((xor & 1) == 1) {
                distance++;
            }

            xor >>= 1;
        }

        return distance;
    }
}

/*
461. Hamming Distance
 */

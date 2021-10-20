package question;

import annotation.BitManipulation;
import annotation.DivideAndConquer;

@DivideAndConquer
@BitManipulation
public class Q190 {
    /*
    Time Complexity: O(1)   Space Complexity: O(1)
     */
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reverse = 0;

        for (int i = 0; i < 32; i++) {
            reverse = (reverse << 1) + (n & 1);
            n >>= 1;
        }
        return reverse;
    }
}

/*
190. Reverse Bits
 */
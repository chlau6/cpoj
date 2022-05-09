
package question;

public class Q2220 {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int result = 0;

        while (xor > 0) {
            if ((xor & 1) == 1) {
                result++;
            }

            xor >>= 1;
        }

        return result;
    }
}

/*
2220. Minimum Bit Flips to Convert Number
 */

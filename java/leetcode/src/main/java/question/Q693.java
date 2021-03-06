package question;

public class Q693 {
    public boolean hasAlternatingBits(int n) {
        return ((n + (n >> 1) + 1) & (n + (n >> 1))) == 0;
    }

    public boolean hasAlternatingBits2(int n) {
        int lastBit = n & 1;
        n >>= 1;

        while (n > 0) {
            int currentBit = n & 1;

            if (lastBit == currentBit) return false;

            lastBit = currentBit;
            n >>= 1;
        }

        return true;
    }
}

/*
693. Binary Number with Alternating Bits
 */

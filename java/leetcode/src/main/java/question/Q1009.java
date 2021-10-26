package question;

import annotation.BitManipulation;

@BitManipulation
public class Q1009 {
    /*
    Time Complexity: O(log n)   Space Complexity: O(1)
     */
    public int bitwiseComplement(int n) {
        int ones = 1;

        while (n > ones) {
            ones = (ones << 1) + 1;
        }

        return n ^ ones;
    }
}

/*
1009. Complement of Base 10 Integer
 */

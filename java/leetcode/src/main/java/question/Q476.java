package question;

import annotation.BitManipulation;

@BitManipulation
public class Q476 {
    /*
    Time Complexity: O(log n)   Space Complexity: O(1)
     */
    public int findComplement(int num) {
        int result = 0;
        int shift = 0;

        while (num != 0) {
            result = (((num & 1) ^ 1) << shift) + result;
            shift++;
            num >>= 1;
        }

        return result;
    }
}

/*
476. Number Complement
 */

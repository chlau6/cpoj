package question;

import annotation.BitManipulation;
import annotation.Maths;
import annotation.Recursion;

@Maths
@BitManipulation
@Recursion
public class Q342 {
    /*
    Time Complexity: O(log n)  Space Complexity: O(1)
     */
    public boolean isPowerOfFour(int n) {
        while (n > 1 && n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }
}

/*
342. Power of Four
 */

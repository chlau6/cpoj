package question;

import annotation.Maths;

@Maths
public class Q7 {
    /*
    Time Complexity: O(log n)  Space Complexity: O(1)
     */
    public int reverse(int x) {
        int reversedInteger = 0;

        while (x != 0) {
            if (Math.abs(reversedInteger) > Integer.MAX_VALUE / 10)
                return 0;

            reversedInteger = reversedInteger * 10 + x % 10;
            x /= 10;
        }
        return reversedInteger;
    }
}

/*
7. ReverseInteger
 */
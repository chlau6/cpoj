package question;

import annotation.*;

@Maths
@BitManipulation
public class Q1342 {
    /*
    Time Complexity: O(log n)   Space Complexity: O(1)
     */
    public int numberOfSteps(int num) {
        if (num == 0) return 0;

        int result = 0;

        while (num > 0) {
            result += ((num & 1) == 1) ? 2 : 1;
            num >>= 1;
        }

        return result - 1;
    }
}

/*
1342. Number of Steps to Reduce a Number to Zero
 */

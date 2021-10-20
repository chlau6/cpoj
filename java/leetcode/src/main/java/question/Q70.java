package question;

import annotation.DynamicProgramming;
import annotation.Maths;
import annotation.Memoization;

@Maths
@DynamicProgramming
@Memoization
public class Q70 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int climbStairs(int n) {
        int first = 1;
        int second = 1;

        for (int i = 2; i <= n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }

        return second;
    }
}

/*
70. Climbing Stairs
 */

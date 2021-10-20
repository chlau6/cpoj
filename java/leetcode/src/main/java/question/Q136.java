package question;

import annotation.Array;
import annotation.BitManipulation;

@Array
@BitManipulation
public class Q136 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int singleNumber(int[] nums) {
        int single = 0;

        for (int num : nums) {
            single ^= num;
        }

        return single;
    }
}

/*
136. Single Number
 */

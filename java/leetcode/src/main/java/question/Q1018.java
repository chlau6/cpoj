package question;

import annotation.Array;

import java.util.ArrayList;
import java.util.List;

@Array
public class Q1018 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int sum = 0;
        List<Boolean> result = new ArrayList<>();

        for (int num : nums) {
            sum = ((sum << 1) + num) % 5;
            result.add(sum == 0);
        }

        return result;
    }
}

/*
1018. Binary Prefix Divisible By 5
 */

package question;

import annotation.Array;
import annotation.Simulation;

@Array
@Simulation
public class Q1920 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int[] buildArray(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] += n * (nums[nums[i]] % n);
        }

        for (int i = 0; i < n; i++) {
            nums[i] /= n;
        }

        return nums;
    }
}

/*
1920. Build Array from Permutation
 */

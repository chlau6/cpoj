package question;

import annotation.Array;

import java.util.ArrayList;
import java.util.List;

@Array
public class Q1313 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i + 1]);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}

/*
1313. Decompress Run-Length Encoded List
 */

package question;

import java.util.ArrayList;
import java.util.List;

public class Q442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                result.add(index + 1);
            }

            nums[index] = -nums[index];
        }

        return result;
    }
}

/*
442. Find All Duplicates in an Array
 */

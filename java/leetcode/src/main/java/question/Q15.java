package question;

import annotation.Array;
import annotation.Sorting;
import annotation.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Array
@TwoPointers
@Sorting
public class Q15 {
    /*
    Time Complexity: O(n^2)   Space Complexity: O(n)
     */
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    result.add(List.of(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return result;
    }
}

/*
15. 3Sum
 */

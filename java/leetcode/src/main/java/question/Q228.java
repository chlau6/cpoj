package question;

import annotation.Array;

import java.util.ArrayList;
import java.util.List;

@Array
public class Q228 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];

            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }

            if (start != nums[i]) {
                ans.add(start + "->" + nums[i]);
            } else {
                ans.add(String.valueOf(start));
            }
        }
        return ans;
    }
}

/*
228. Summary Ranges
 */

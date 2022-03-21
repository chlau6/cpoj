package question;

import java.util.ArrayList;
import java.util.List;

public class Q2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();

        int count = 0;
        int start = 0;

        for (int num : nums) {
            if (num == target) {
                count++;
            } else if (num < target) {
                start++;
            }
        }

        while (--count >= 0) {
            list.add(start++);
        }

        return list;
    }
}
/*
2089. Find Target Indices After Sorting Array
 */

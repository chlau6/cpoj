package question;

import annotation.Array;
import annotation.Greedy;
import annotation.TwoPointers;

@Array
@TwoPointers
@Greedy
public class Q11 {
    /*
    Time Complexity: O(n)  Space Complexity: O(1)
     */
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int result = 0;

        while (i < j) {
            int volume = Math.min(height[i], height[j]) * (j - i);
            result = Math.max(result, volume);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return result;
    }
}

/*
11. Container With Most Water
 */

package question;

import java.util.LinkedList;
import java.util.Queue;

public class Q487 {
    /*
    Infinite Stream
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int max = 0;
        int flip = 1;
        Queue<Integer> q = new LinkedList<>();

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                q.add(right);
            }

            if (q.size() > flip) {
                left = q.poll() + 1;    // study the case of [1, 0, 1, 1, 0]
            }

            max = Math.max(max, right - left + 1);  // study the case of [1, 0, 1, 1, 0]
        }
        return max;
    }

    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int findMaxConsecutiveOnes3(int[] nums) {
        int max = 0;
        int current = 0;
        int count = 0;

        for (int num : nums) {
            count++;

            if (num == 0) {
                current = count;
                count = 0;
            }

            max = Math.max(max, current + count);
        }
        return max;
    }
}

/*
487. Max Consecutive Ones II
 */

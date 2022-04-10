package question;

import java.util.Random;

public class Q398 {
    class Solution {
        int[] nums;
        Random random = new Random();

        public Solution(int[] nums) {
            this.nums = nums;
        }

        public int pick(int target) {
            int result = 0;
            int count = 0;
            int n = nums.length;

            for (int i = 0; i < n; i++) {
                if (nums[i] != target) continue;

                if (random.nextInt(++count) == 0) {
                    result = i;
                }
            }

            return result;
        }
    }
}

/*
398. Random Pick Index
 */

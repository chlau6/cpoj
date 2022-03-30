package question;

import java.util.Random;

public class Q384 {
    class Solution {
        int[] nums;
        Random random = new Random();

        public Solution(int[] nums) {
            this.nums = nums;
        }

        public int[] reset() {
            return nums;
        }

        public int[] shuffle() {
            int[] result = nums.clone();
            int n = result.length;

            for (int i = n - 1; i > 0; i--) {
                int j = random.nextInt(i + 1);
                swap(result, i, j);
            }

            return result;
        }

        public void swap(int[] a, int i, int j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

        }
    }
}

/*
384. Shuffle an Array
 */

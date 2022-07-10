package question;

public class Q528 {
    class Solution {
        int[] sum;

        public Solution(int[] w) {
            sum = w;

            for (int i = 1; i < w.length; i++) {
                sum[i] = sum[i - 1] + w[i];
            }
        }

        public int pickIndex() {
            int x = (int) (Math.random() * sum[sum.length - 1]);
            int left = 0;
            int right = sum.length - 1;

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (sum[mid] <= x) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            return right;
        }
    }

}

/*
525. Contiguous Array
 */

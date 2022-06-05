package question;

public class Q1283 {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 1000000;

        while (left < right) {
            int sum = 0;
            int mid = left + (right - left) / 2;

            for (int num : nums) {
                sum += (num + mid - 1) / mid;
            }

            if (sum > threshold) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}

/*
1283. Find the Smallest Divisor Given a Threshold
 */

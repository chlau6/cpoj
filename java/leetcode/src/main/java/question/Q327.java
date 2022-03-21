package question;

public class Q327 {
    int count = 0;

    public int countRangeSum(int[] nums, int lower, int upper) {
        int n = nums.length;
        long[] sums = new long[n + 1];
        long[] temp = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            sums[i] = sums[i - 1] + nums[i - 1];
        }

        mergesort(sums, temp, 0, n, lower, upper);

        return count;
    }

    private void mergesort(long[] sums, long[] temp, int start, int end, int lower, int upper) {
        if (start >= end) return;

        int mid = start + (end - start) / 2;
        mergesort(sums, temp, start, mid, lower, upper);
        mergesort(sums, temp, mid + 1, end, lower, upper);

        merge(sums, temp, start, mid, end, lower, upper);
    }

    private void merge(long[] sums, long[] temp, int start, int mid, int end, int lower, int upper) {
        for (int k = start; k <= end; k++) {
            temp[k] = sums[k];
        }

        int left = mid + 1;
        int right = mid + 1;

        for (int k = start; k <= mid; k++) {
            while (left <= end && temp[left] - temp[k] < lower) {
                left++;
            }

            while (right <= end && temp[right] - temp[k] <= upper) {
                right++;
            }

            count += right - left;
        }

        int i = start;
        int j = mid + 1;

        for (int k = start; k <= end; k++) {
            if (j > end || (i <= mid && temp[i] <= temp[j])) {
                sums[k] = temp[i++];
            } else {
                sums[k] = temp[j++];
            }
        }
    }
}
/*
327. Count of Range Sum
 */

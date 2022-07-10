package question;

public class Q2333 {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int[] diff = new int[100001];
        int n = nums1.length;

        for (int i = 0; i < n; i++) {
            int abs = Math.abs(nums1[i] - nums2[i]);
            diff[abs]++;
        }

        int left = k1 + k2;

        for (int i = 100000; i >= 0; i--) {
            int count = diff[i];

            if (count <= left) {
                if (i <= 1) return 0;

                diff[i - 1] += diff[i];
                diff[i] = 0;
                left -= count;
            } else {
                if (i == 0) return 0;

                diff[i] -= left;
                diff[i - 1] += left;
                break;
            }
        }

        long result = 0;

        for (int i = 0; i <= 100000; i++) {
            result += (long) diff[i] * (long) i * i;
        }

        return result;
    }
}

/*
2333. Minimum Sum of Squared Difference
 */

package question;

public class Q4 {
    /*
    Time Complexity: O(log(min(m, n)))  Space Complexity: O(1)
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        if (nums1.length < nums2.length) return findMedianSortedArrays(nums2, nums1);

        int left = 0;
        int right = n2 * 2;

        while (left <= right) {
            int mid2 = left + (right - left) / 2;
            int mid1 = n1 + n2 - mid2;

            int l1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[(mid1 - 1) / 2];
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[(mid2 - 1) / 2];
            int r1 = (mid1 == n1 * 2) ? Integer.MAX_VALUE : nums1[mid1 / 2];
            int r2 = (mid2 == n2 * 2) ? Integer.MAX_VALUE : nums2[mid2 / 2];

            if (l1 > r2) {
                left = mid2 + 1;
            } else if (l2 > r1) {
                right = mid2 - 1;
            } else {
                return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
            }
        }

        return -1;
    }

    /*
    Time Complexity: O(m + n)   Space Complexity: O(1)
     */
    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int med1 = 0;
        int med2 = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;

        int loop = (n1 + n2) / 2;

        for (int k = 0; k <= loop; k++) {
            med1 = med2;

            if (i == n1) {
                med2 = nums2[i++];
            } else if (j == n2) {
                med2 = nums1[j++];
            } else if (nums1[i] < nums2[j]) {
                med2 = nums1[i++];
            } else {
                med2 = nums2[j++];
            }
        }

        return ((n1 + n2) % 2 == 0) ? (med1 + med2) / 2.0 : med2;
    }
}

/*
4. Median of Two Sorted Arrays
 */

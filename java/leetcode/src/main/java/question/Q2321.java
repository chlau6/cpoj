package question;

public class Q2321 {
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        int s1 = 0;
        int s2 = 0;
        int n = nums1.length;

        for (int num : nums1) {
            s1 += num;
        }

        for (int num : nums2) {
            s2 += num;
        }

        int max1 = 0;
        int curr1 = 0;
        int max2 = 0;
        int curr2 = 0;

        for (int i = 0; i < n; i++) {
            curr1 += (nums2[i] - nums1[i]);
            curr2 += (nums1[i] - nums2[i]);

            max1 = Math.max(max1, curr1);
            max2 = Math.max(max2, curr2);

            if (curr1 < 0) curr1 = 0;
            if (curr2 < 0) curr2 = 0;
        }

        return Math.max(s1 + max1, s2 + max2);
    }
}

/*
2321. Maximum Score Of Spliced Array
 */

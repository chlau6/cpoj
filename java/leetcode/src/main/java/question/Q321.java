package question;

import java.util.Stack;

public class Q321 {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;

        int[] result = new int[k];

        int start = Math.max(0, k - n);
        int end = Math.min(k, m);

        for (int i = start; i <= end; i++) {
            int[] a1 = findArray(nums1, i);
            int[] a2 = findArray(nums2, k - i);

            int[] array = mergeArray(a1, a2, k);

            if (greater(array, 0, result, 0)) {
                result = array;
            }
        }

        return result;
    }

    public int[] findArray(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            while (stack.size() + n - i > k && !stack.isEmpty() && stack.peek() < nums[i]) {
                stack.pop();
            }

            if (stack.size() < k) {
                stack.push(nums[i]);
            }
        }

        int[] result = new int[k];

        for (int i = k - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

    public int[] mergeArray(int[] a1, int[] a2, int k) {
        int[] result = new int[k];

        int i = 0;
        int j = 0;
        int index = 0;

        while (index < k) {
            result[index++] = greater(a1, i, a2, j) ? a1[i++] : a2[j++];
        }

        return result;
    }

    public boolean greater(int[] a1, int i, int[] a2, int j) {
        int m = a1.length;
        int n = a2.length;

        while (i < m && j < n && a1[i] == a2[j]) {
            i++;
            j++;
        }

        return j == n || (i < m && a1[i] > a2[j]);
    }
}

/*
321. Create Maximum Number
 */

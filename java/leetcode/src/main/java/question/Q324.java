package question;

import java.util.Arrays;

public class Q324 {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        int[] temp = Arrays.copyOf(nums, n);
        int j = (n - 1) / 2;
        int k = n - 1;

        Arrays.sort(temp);

        for (int i = 0; i < n; i++) {
            nums[i] = (i % 2 == 0) ? temp[j--] : temp[k--];
        }
    }
}
/*
324. Wiggle Sort II
 */

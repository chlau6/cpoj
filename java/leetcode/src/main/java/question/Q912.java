package question;

public class Q912 {
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        mergesort(nums, 0, n - 1);
        return nums;
    }

    public void mergesort(int[] nums, int start, int end) {
        if (start >= end) return;

        int mid = start + (end - start) / 2;

        mergesort(nums, start, mid);
        mergesort(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }

    public void merge(int[] nums, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int n = end - start + 1;
        int[] temp = new int[n];

        for (int k = 0; k < n; k++) {
            if (j > end || (i <= mid && nums[i] <= nums[j])) {
                temp[k] = nums[i++];
            } else {
                temp[k] = nums[j++];
            }
        }

        for (int k = 0; k < n; k++) {
            nums[k + start] = temp[k];
        }
    }
}

/*
912. Sort an Array
 */

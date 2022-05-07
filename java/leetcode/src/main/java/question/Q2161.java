package question;

public class Q2161 {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];

        int i = 0;
        int j = n - 1;
        int left = 0;
        int right = n - 1;

        while (i < n) {
            if (nums[i] < pivot) {
                result[left++] = nums[i];
            }

            if (nums[j] > pivot) {
                result[right--] = nums[j];
            }

            i++;
            j--;
        }

        while (left <= right) {
            result[left++] = pivot;
        }

        return result;
    }
}

/*
2161. Partition Array According to Given Pivot
 */

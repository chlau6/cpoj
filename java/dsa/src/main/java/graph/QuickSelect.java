package graph;

public class QuickSelect {
    public int findKthLargest(int[] nums, int k) {
        int i = 0;
        int j = nums.length - 1;

        while (true) {
            int pos = partition(nums, i, j);

            if (pos == k - 1) {
                return nums[k - 1];
            } else if (pos > k - 1) {
                j = pos - 1;
            } else {
                i = pos + 1;
            }
        }
    }

    public int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        int i = left + 1;
        int j = right;

        while (i <= j) {
            if (nums[i] < pivot && nums[j] > pivot) {
                swap(nums, i++, j--);
            }

            if (nums[i] >= pivot) i++;
            if (nums[j] <= pivot) j--;
        }

        swap(nums, left, j);

        return j;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

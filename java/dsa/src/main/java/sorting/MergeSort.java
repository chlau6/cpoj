package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = new int[] {3, 2, 5, 6, 7, 8, 3, 2, 1, 1, 0};
        new MergeSort().mergeSort(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }

    public void mergeSort(int[] nums, int start, int end) {
        if (start >= end) return;

        int mid = (start + end) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }

    public void merge(int[] nums, int start, int mid, int end) {
        int leftSize = mid - start + 1;
        int rightSize = end - mid;

        int[] leftSubarray = new int[leftSize];
        int[] rightSubarray = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftSubarray[i] = nums[start + i];
        }

        for (int i = 0; i < rightSize; i++) {
            rightSubarray[i] = nums[mid + 1 + i];
        }

        int i = 0, j = 0, k = start;

        while (i < leftSize && j < rightSize) {
            if (leftSubarray[i] < rightSubarray[j]) {
                nums[k++] = leftSubarray[i++];
            } else {
                nums[k++] = rightSubarray[j++];
            }
        }

        while (i < leftSize) {
            nums[k++] = leftSubarray[i++];
        }

        while (j < rightSize) {
            nums[k++] = rightSubarray[j++];
        }
    }
}

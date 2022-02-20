package question;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;

public class Q215 {
    /*
    QuickSelect
     */
    public int findKthLargest(int[] nums, int k) {
        shuffle(nums);

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

    public void shuffle(int[] nums) {
        int n = nums.length;

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int j = random.nextInt(n);
            swap(nums, i, j);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /*
    Heap
     */
    public int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {
            pq.add(num);
        }

        for (int i = 0; i < k - 1; i++) {
            pq.remove();
        }

        return pq.peek();
    }

    /*
    Mergesort
     */
    public int findKthLargest3(int[] nums, int k) {
        int n = nums.length;

        Arrays.sort(nums);

        return nums[n - k];
    }
}

/*
215. Kth Largest Element in an Array
 */

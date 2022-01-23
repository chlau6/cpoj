package question;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Q215 {
    /*
    QuickSelect
     */
    public int findKthLargest(int[] nums, int k) {
        shuffle(nums);

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = partition(nums, left, right);

            if (mid == k - 1) break;
            if (mid < k - 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return nums[k - 1];
    }

    public int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int swapIndex = left - 1;

        for (int i = left; i < right; i++) {
            if (pivot <= nums[i]) {
                swap(nums, ++swapIndex, i);
            }
        }

        swap(nums, ++swapIndex, right);
        return swapIndex;
    }

    private void shuffle(int[] nums) {
        int len = nums.length;
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            int change = random.nextInt(len);
            swap(nums, i, change);
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
        Queue<Integer> queue = new PriorityQueue<>();

        for (int num : nums) {
            queue.add(num);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        return queue.element();
    }
}

/*
215. Kth Largest Element in an Array
 */

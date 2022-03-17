package question;

import java.util.ArrayList;
import java.util.List;

public class Q315 {
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] index = new int[n];

        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        mergesort(result, nums, index, 0, n - 1);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(result[i]);
        }

        return list;
    }

    public void mergesort(int[] result, int[] nums, int[] index, int start, int end) {
        if (start >= end) return;

        int mid = start + (end - start) / 2;
        mergesort(result, nums, index, start, mid);
        mergesort(result, nums, index, mid + 1, end);

        merge(result, nums, index, start, mid, mid + 1, end);
    }

    public void merge(int[] result, int[] nums, int[] index, int l1, int l2, int r1, int r2) {
        int start = l1;
        int[] temp = new int[r2 - l1 + 1];
        int count = 0;
        int k = 0;

        while (l1 <= l2 || r1 <= r2) {
            if (l1 > l2) {
                temp[k++] = index[r1++];
            } else if (r1 > r2) {
                result[index[l1]] += count;
                temp[k++] = index[l1++];
            } else if (nums[index[l1]] > nums[index[r1]]) {
                count++;
                temp[k++] = index[r1++];
            } else {
                result[index[l1]] += count;
                temp[k++] = index[l1++];
            }
        }

        for (int i = 0; i < temp.length; i++) {
            index[start + i] = temp[i];
        }
    }
}

/*
315. Count of Smaller Numbers After Self
 */

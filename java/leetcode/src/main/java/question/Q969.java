package question;

import java.util.ArrayList;
import java.util.List;

public class Q969 {
    public static void main(String[] args) {
        System.out.println(new Q969().pancakeSort(new int[]{4, 3, 2, 1}));
    }

    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans = new ArrayList<>();

        for (int i = arr.length; i > 0; i--) {
            int j = 0;
            while (arr[j] != i) {
                j++;
            }

            reverse(arr, j + 1);
            ans.add(j + 1);
            reverse(arr, i);
            ans.add(i);
        }

        return ans;
    }

    public void reverse(int[] nums, int k) {
        int i = 0;
        int j = k - 1;

        while (i < j) {
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
    }
}

/*
969. Pancake Sorting
 */

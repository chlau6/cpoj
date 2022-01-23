package question;

public class Q31 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i, j, start, end;

        for (i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }

        if (i < 0) {
            reverse(nums, 0, n - 1);
            return;
        }

        for (j = n - 1; j > i; j--) {
            if (nums[j] > nums[i]) {
                break;
            }
        }

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        reverse(nums, i + 1, n - 1);

    }

    public void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
    }
}

/*
31. Next Permutation
 */

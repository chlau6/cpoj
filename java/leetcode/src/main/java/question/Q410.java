package question;

public class Q410 {
    public int splitArray(int[] nums, int m) {
        int left = 0;
        int right = 0;

        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canSplit(nums, mid, m)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }

    public boolean canSplit(int[] nums, int sum, int m) {
        int count = 1;
        int currSum = 0;

        for (int num : nums) {
            currSum += num;

            if (currSum > sum) {
                currSum = num;
                count++;

                if (count > m) return false;
            }
        }

        return true;
    }
}

/*
410. Split Array Largest Sum
 */

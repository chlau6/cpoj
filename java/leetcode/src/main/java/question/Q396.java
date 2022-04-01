package question;

public class Q396 {
    public int maxRotateFunction(int[] nums) {
        int base = 0;
        int sum = 0;
        int n = nums.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            base += i * nums[i];
        }

        result = base;

        for (int i = 1; i < n; i++) {
            base = base + sum - n * nums[n - i];
            result = Math.max(result, base);
        }

        return result;
    }
}

/*
396. Rotate Function
 */

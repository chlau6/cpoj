package question;

public class Q977 {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;

        for (int k = j; k >= 0; k--) {
            if (Math.abs(nums[i]) >= Math.abs(nums[j])) {
                result[k] = nums[i] * nums[i];
                i++;
            } else {
                result[k] = nums[j] * nums[j];
                j--;
            }
        }
        return result;
    }
}

/*
977. Squares of a Sorted Array
 */

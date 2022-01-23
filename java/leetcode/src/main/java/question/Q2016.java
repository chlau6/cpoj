package question;

public class Q2016 {
    public int maximumDifference(int[] nums) {
        int result = 0;
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            result = Math.max(result, num - min);
        }

        return result == 0 ? -1 : result;
    }
}
/*
2016. Maximum Difference Between Increasing Elements
 */

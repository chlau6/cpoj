
package question;

public class Q2239 {
    public int findClosestNumber(int[] nums) {
        int result = Integer.MAX_VALUE;

        for (int num : nums) {
            if (Math.abs(num) < Math.abs(result)) {
                result = num;
            } else if (Math.abs(num) == Math.abs(result)) {
                result = Math.max(result, num);
            }
        }

        return result;
    }
}

/*
2239. Find Closest Number to Zero
 */

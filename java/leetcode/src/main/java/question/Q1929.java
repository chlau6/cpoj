package question;

public class Q1929 {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[i] = result[i + n] = nums[i];
        }

        return result;
    }
}

/*
1929. Concatenation of Array
 */

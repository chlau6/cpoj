package question;

public class Q1911 {
    public long maxAlternatingSum(int[] nums) {
        long odd = 0;
        long even = 0;

        for (int num : nums) {
            even = Math.max(even, odd + num);
            odd = even - num;
        }

        return even;
    }
}

/*
1911. Maximum Alternating Subsequence Sum
 */

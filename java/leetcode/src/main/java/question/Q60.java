package question;

public class Q60 {
    public String getPermutation(int n, int k) {
        StringBuilder nums = new StringBuilder("123456789");
        StringBuilder result = new StringBuilder();

        int[] fib = new int[n];
        fib[0] = 1;

        for (int i = 1; i < n; i++) {
            fib[i] = fib[i - 1] * i;
        }

        k--;

        for (int i = n; i >= 1; i--) {
            int j = k / fib[i - 1];
            k %= fib[i - 1];

            result.append(nums.charAt(j));
            nums.deleteCharAt(j);
        }

        return result.toString();
    }
}

/*
60. Permutation Sequence
 */

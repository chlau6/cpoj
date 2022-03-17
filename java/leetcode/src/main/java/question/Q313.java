package question;

public class Q313 {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] nums = new int[n];
        int size = primes.length;
        int[] index = new int[size];

        nums[0] = 1;

        for (int i = 1; i < n; i++) {
            nums[i] = Integer.MAX_VALUE;

            for (int j = 0; j < size; j++) {
                nums[i] = Math.min(nums[i], primes[j] * nums[index[j]]);
            }

            for (int j = 0; j < size; j++) {
                if (primes[j] * nums[index[j]] == nums[i]) {
                    index[j]++;
                }
            }
        }

        return nums[n - 1];
    }
}

/*
313. Super Ugly Number
 */

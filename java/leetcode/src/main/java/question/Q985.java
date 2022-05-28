package question;

public class Q985 {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n = queries.length;
        int[] result = new int[n];
        int sum = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        for (int i = 0; i < n; i++) {
            int value = queries[i][0];
            int index = queries[i][1];

            if (nums[index] % 2 == 0) {
                sum -= nums[index];
            }

            nums[index] += value;

            if (nums[index] % 2 == 0) {
                sum += nums[index];
            }

            result[i] = sum;
        }

        return result;
    }
}

/*
985. Sum of Even Numbers After Queries
 */

package question;

public class Q1343 {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0;
        int sum = 0;
        int n = arr.length;
        int result = 0;

        threshold *= k;

        for (int j = 0; j < n; j++) {
            sum += arr[j];

            if (j >= k - 1) {
                if (sum >= threshold) {
                    result++;
                }
                sum -= arr[i++];
            }
        }

        return result;
    }
}

/*
1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
 */

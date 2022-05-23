package question;

public class Q1191 {
    public int kConcatenationMaxSum(int[] arr, int k) {
        int divisor = 1000000007;
        int globalMax = Integer.MIN_VALUE;
        int localMax = 0;
        int n = arr.length;
        long total = 0;

        for (int a : arr) {
            total += a;
        }


        for (int i = 0; i < n * Math.min(2, k); i++) {
            localMax = Math.max(localMax + arr[i % n], arr[i % n]);
            globalMax = Math.max(globalMax, localMax);
        }

        long first = 0;
        long second = globalMax;
        long third = total * Math.max(0, k - 2) + globalMax;

        return (int) (Math.max(first, Math.max(second, third)) % divisor);
    }
}

/*
1191. K-Concatenation Maximum Sum
 */

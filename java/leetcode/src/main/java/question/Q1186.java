package question;

public class Q1186 {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int[] maxEnd = new int[n];
        int[] maxStart = new int[n];
        int result = arr[0];

        maxEnd[0] = arr[0];
        for (int i = 1; i < n; i++) {
            maxEnd[i] = Math.max(arr[i], maxEnd[i - 1] + arr[i]);
            result = Math.max(result, maxEnd[i]);
        }

        maxStart[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxStart[i] = Math.max(arr[i], maxStart[i + 1] + arr[i]);
        }


        for (int i = 1; i < n - 1; i++) {
            result = Math.max(result, maxEnd[i - 1] + maxStart[i + 1]);
        }

        return result;
    }
}

/*
1186. Maximum Subarray Sum with One Deletion
 */

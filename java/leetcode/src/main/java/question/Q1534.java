package question;

public class Q1534 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int result = 0;
        int length = arr.length;

        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                if (Math.abs(arr[i] - arr[j]) > a) continue;

                for (int k = j + 1; k < length; k++) {
                    if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                        result++;
                    }
                }
            }
        }

        return result;
    }
}

/*
1534. Count Good Triplets
 */

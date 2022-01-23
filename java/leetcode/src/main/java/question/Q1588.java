package question;

public class Q1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            sum += ((i + 1) * (length - i) + 1) / 2 * arr[i];
        }

        return sum;
    }
}

/*
1588. Sum of All Odd Length Subarrays
 */

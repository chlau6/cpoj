package question;

import annotation.Array;

@Array
public class Q1652 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        if (k == 0) return result;

        int start = 1;
        int end = k;
        int sum = 0;

        if (k < 0) {
            k = -k;
            start = n - k;
            end = n - 1;
        }

        for (int i = start; i <= end; i++) {
            sum += code[i];
        }

        for (int i = 0; i < n; i++) {
            result[i] = sum;

            sum -= code[start++ % n];
            sum += code[++end % n];
        }

        return result;
    }
}

/*
1652. Defuse the Bomb
 */

package question;

import java.util.Arrays;

public class Q1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != arr[i - 1] - arr[i - 2]) return false;
        }

        return true;
    }
}

/*
1502. Can Make Arithmetic Progression From Sequence
 */

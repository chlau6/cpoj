package question;

public class Q670 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int maximumSwap(int num) {
        char[] digits = String.valueOf(num).toCharArray();

        int firstPointer = -1;
        int secondPointer = -1;
        int maxPos = digits.length - 1;

        for (int i = digits.length - 2; i >= 0; i--) {
            if (digits[i] < digits[maxPos]) {
                firstPointer = i;
                secondPointer = maxPos;
            } else if (digits[i] > digits[maxPos]) {
                maxPos = i;
            }
        }

        if (firstPointer != -1) {
            char temp = digits[firstPointer];
            digits[firstPointer] = digits[secondPointer];
            digits[secondPointer] = temp;
        }
        return Integer.parseInt(String.valueOf(digits));
    }
}

/*
670. Maximum Swap
 */

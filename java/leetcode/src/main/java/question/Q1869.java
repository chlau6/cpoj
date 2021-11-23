package question;

import annotation.Strings;

@Strings
public class Q1869 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public boolean checkZeroOnes(String s) {
        int maxOnes = 0;
        int maxZeros = 0;
        int currOnes = 0;
        int currZeros = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == '0') {
                maxZeros = Math.max(maxZeros, ++currZeros);
                currOnes = 0;
            } else {
                currZeros = 0;
                maxOnes = Math.max(maxOnes, ++currOnes);
            }
        }

        return maxOnes > maxZeros;
    }
}

/*
1869. Longer Contiguous Segments of Ones than Zeros
 */

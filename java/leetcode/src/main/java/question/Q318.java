package question;

public class Q318 {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] xor = new int[n];
        int result = 0;

        for (int i = 0; i < n; i++) {
            String str = words[i];

            int len = str.length();

            for (char c : str.toCharArray()) {
                xor[i] |= (1 << (c - 'a'));
            }
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((xor[i] & xor[j]) == 0) {
                    result = Math.max(result, words[i].length() * words[j].length());
                }
            }
        }

        return result;
    }
}

/*
318. Maximum Product of Word Lengths
 */

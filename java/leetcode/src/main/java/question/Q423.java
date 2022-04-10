package question;

public class Q423 {
    public String originalDigits(String s) {
        StringBuilder builder = new StringBuilder();
        int[] counts = new int[26];
        int[] digits = new int[10];
        int n = s.length();

        for (int i = 0; i < n; i++) {
            counts[s.charAt(i) - 'a']++;
        }

        digits[0] = counts['z' - 'a'];
        digits[2] = counts['w' - 'a'];
        digits[4] = counts['u' - 'a'];
        digits[6] = counts['x' - 'a'];
        digits[8] = counts['g' - 'a'];
        digits[1] = counts['o' - 'a'] - digits[0] - digits[2] - digits[4];
        digits[3] = counts['h' - 'a'] - digits[8];
        digits[5] = counts['f' - 'a'] - digits[4];
        digits[7] = counts['s' - 'a'] - digits[6];
        digits[9] = counts['i' - 'a'] - digits[5] - digits[6] - digits[8];

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < digits[i]; j++) {
                builder.append(i);
            }
        }

        return builder.toString();
    }
}

/*
423. Reconstruct Original Digits from English
 */

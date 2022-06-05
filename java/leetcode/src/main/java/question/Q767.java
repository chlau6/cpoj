package question;

public class Q767 {
    public String reorganizeString(String s) {
        int[] count = new int[26];
        int n = s.length();
        char[] result = new char[n];
        int maxCount = 0;
        char letter = 'a';

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (++count[c - 'a'] > maxCount) {
                maxCount = count[c - 'a'];
                letter = c;
            }
        }

        if ((n + 1) / 2 < maxCount) return "";

        int index = 0;

        for (int i = 0; i < maxCount; i++) {
            result[index] = letter;
            count[letter - 'a']--;
            index += 2;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] == 0) continue;

            while (count[i] > 0) {
                if (index >= n) {
                    index = 1;
                }

                result[index] = (char) (i + 'a');
                count[i]--;

                index += 2;
            }
        }

        return String.valueOf(result);
    }
}

/*
767. Reorganize String
 */

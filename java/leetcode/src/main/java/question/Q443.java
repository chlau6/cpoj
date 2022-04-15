package question;

public class Q443 {
    public int compress(char[] chars) {
        int n = chars.length;

        int index = 0;
        int i = 0;
        int j = 0;

        while (i < n) {
            while (j < n && chars[j] == chars[i]) {
                j++;
            }

            chars[index++] = chars[i];

            if (j - i > 1) {
                for (char c : String.valueOf(j - i).toCharArray()) {
                    chars[index++] = c;
                }
            }

            i = j;
        }

        return index;
    }
}

/*
443. String Compression
 */

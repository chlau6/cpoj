package question;

public class Q1370 {
    public String sortString(String s) {
        int[] counts = new int[26];
        int length = s.length();

        for (int i = 0; i < length; i++) {
            counts[s.charAt(i) - 'a']++;
        }

        int count = 0;
        var builder = new StringBuilder();

        while (count < length) {
            for (int i = 0; i < 26; i++) {
                if (--counts[i] >= 0) {
                    builder.append((char) (i + 'a'));
                    count++;
                }
            }

            for (int i = 25; i >= 0; i--) {
                if (--counts[i] >= 0) {
                    builder.append((char) (i + 'a'));
                    count++;
                }
            }
        }

        return builder.toString();
    }
}

/*
1370. Increasing Decreasing String
 */

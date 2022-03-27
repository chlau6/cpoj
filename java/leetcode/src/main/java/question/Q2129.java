package question;

public class Q2129 {
    public String capitalizeTitle(String title) {
        char[] s = title.toCharArray();
        int n = s.length;

        int j = 0;
        for (int i = 0; i <= n; i++) {
            if (i == n || s[i] == ' ') {
                if (i - j > 2) {
                    s[j] = Character.toUpperCase(s[j]);
                }

                j = i + 1;
            } else {
                s[i] = Character.toLowerCase(s[i]);
            }
        }

        return new String(s);
    }
}
/*
2129. Capitalize the Title
 */

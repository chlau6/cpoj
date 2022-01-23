package question;

public class Q1935 {
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean[] broken = new boolean[26];
        int n1 = brokenLetters.length();
        int n2 = text.length();

        for (int i = 0; i < n1; i++) {
            int c = brokenLetters.charAt(i) - 'a';
            broken[c] = true;
        }

        int result = 0;
        int count = 1;

        for (int i = 0; i < n2; i++) {
            char c = text.charAt(i);

            if (c == ' ') {
                result += count;
                count = 1;
            } else if (broken[c - 'a']) {
                count = 0;
            }
        }

        return result + count;
    }
}

/*
1935. Maximum Number of Words You Can Type
 */

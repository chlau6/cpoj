package question;

public class Q151 {
    public String reverseWords(String s) {
        char[] str = s.toCharArray();

        int n = str.length;

        reverse(str, 0, n - 1);
        reverseWords(str, n);
        return helper(str, n);
    }

    public void reverse(char[] s, int i, int j) {
        while (i < j) {
            char c = s[i];
            s[i++] = s[j];
            s[j--] = c;
        }
    }

    public void reverseWords(char[] s, int n) {
        int i = 0;

        while (i < n) {
            while (i < n && s[i] == ' ') i++;
            int j = i;

            while (j < n && s[j] != ' ') j++;
            reverse(s, i, j - 1);
            i = j;
        }
    }

    public String helper(char[] s, int n) {
        int i = 0;
        int j = 0;

        while (i < n) {
            while (i < n && s[i] == ' ') i++;
            while (i < n && s[i] != ' ') s[j++] = s[i++];
            while (i < n && s[i] == ' ') i++;
            if (i < n) s[j++] = ' ';
        }

        return new String(s, 0, j);
    }
}

/*
151. Reverse Words in a String
 */

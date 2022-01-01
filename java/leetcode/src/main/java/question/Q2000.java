package question;

public class Q2000 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public String reversePrefix(String word, char ch) {
        char[] str = word.toCharArray();
        int pos = -1;
        int n = str.length;

        for (int i = 0; i < n; i++) {
            if (str[i] == ch) {
                pos = i;
                break;
            }
        }

        int i = 0;
        int j = pos;

        while (i < j) {
            char temp = str[i];
            str[i++] = str[j];
            str[j--] = temp;
        }

        return new String(str);
    }
}
/*
2000. Reverse Prefix of Word
 */

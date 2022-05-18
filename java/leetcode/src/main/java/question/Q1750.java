package question;

public class Q1750 {
    public int minimumLength(String s) {
        int n = s.length();

        int i = 0;
        int j = n - 1;
        char[] str = s.toCharArray();

        while (i < j && str[i] == str[j]) {
            char c = str[i];

            while (i <= j && str[i] == c) {
                i++;
            }

            while (i <= j && str[j] == c) {
                j--;
            }
        }

        return j - i + 1;
    }
}

/*
1750. Minimum Length of String After Deleting Similar Ends
 */

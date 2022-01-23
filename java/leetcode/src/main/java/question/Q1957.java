package question;

public class Q1957 {
    public String makeFancyString(String s) {
        char[] str = s.toCharArray();
        int n = str.length;
        int j = 1;
        int count = 1;

        for (int i = 1; i < n; i++) {
            count = str[i] == str[i - 1] ? count + 1 : 1;

            if (count < 3) {
                str[j++] = str[i];
            }
        }

        return new String(str, 0, j);
    }
}

/*
1957. Delete Characters to Make Fancy String
 */

package question;

public class Q1694 {
    public String reformatNumber(String number) {
        var filter = new StringBuilder();
        var builder = new StringBuilder();

        for (char c : number.toCharArray()) {
            if (c != '-' && c != ' ') {
                filter.append(c);
            }
        }

        int i = 0;
        int n = filter.length();

        while (i < n) {
            int j = (n - i == 2 || n - i == 4) ? 2 : 3;

            builder.append(filter, i, i + j);
            i += j;

            if (i != n) {
                builder.append('-');
            }
        }

        return builder.toString();
    }
}

/*
1694. Reformat Phone Number
 */

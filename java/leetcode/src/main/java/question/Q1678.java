package question;

import annotation.Strings;

@Strings
public class Q1678 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public String interpret(String command) {
        int n = command.length();
        int i = 0;
        var builder = new StringBuilder();

        while (i < n) {
            if (command.charAt(i) == 'G') {
                builder.append('G');
                i++;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                builder.append('o');
                i += 2;
            } else {
                builder.append("al");
                i += 4;
            }
        }

        return builder.toString();
    }
}

/*
1678. Goal Parser Interpretation
 */

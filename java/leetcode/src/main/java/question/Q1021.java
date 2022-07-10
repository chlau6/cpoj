package question;

public class Q1021 {
    public String removeOuterParentheses(String s) {
        StringBuilder builder = new StringBuilder();
        int n = s.length();
        int balance = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == '(' && ++balance > 1 || c == ')' && --balance > 0) {
                builder.append(c);
            }
        }

        return builder.toString();
    }
}

/*
1021. Remove Outermost Parentheses
 */

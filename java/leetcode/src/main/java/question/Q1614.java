package question;

public class Q1614 {
    public int maxDepth(String s) {
        int count = 0;
        int result = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);

            if (c == '(') result = Math.max(result, ++count);
            else if (c == ')') count--;
        }

        return result;
    }
}

/*
1614. Maximum Nesting Depth of the Parentheses
 */

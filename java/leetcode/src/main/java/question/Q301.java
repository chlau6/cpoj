package question;

import java.util.*;

public class Q301 {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        boolean found = false;

        queue.add(s);
        visited.add(s);

        while (!queue.isEmpty()) {
            String str = queue.remove();

            if (isValid(str)) {
                result.add(str);
                found = true;
            }

            if (found) continue;

            int n = str.length();
            for (int i = 0; i < n; i++) {
                char c = str.charAt(i);

                if (c != '(' && c != ')') continue;

                String t = str.substring(0, i) + str.substring(i + 1);

                if (!visited.contains(t)) {
                    queue.add(t);
                    visited.add(t);
                }
            }
        }

        return result;
    }

    public boolean isValid(String s) {
        int count = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == '(') {
                count++;
            } else if (c == ')' && --count < 0) {
                return false;
            }
        }

        return count == 0;
    }
}

/*
301. Remove Invalid Parentheses
 */

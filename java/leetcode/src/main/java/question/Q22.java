package question;

import java.util.ArrayList;
import java.util.List;

public class Q22 {
    /*
    Time Complexity: O(n * catalan(n))   Space Complexity: O(n * catalan(n))
     */
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        recursion(result, "", n, 0, 0);

        return result;
    }

    public void recursion(List<String> result, String curr, int n, int left, int right) {
        if (curr.length() == 2 * n) {
            result.add(curr);
            return;
        }

        if (left < n) {
            recursion(result, curr + "(", n, left + 1, right);
        }

        if (right < left) {
            recursion(result, curr + ")", n, left, right + 1);
        }
    }
}

/*
22. Generate Parentheses
 */

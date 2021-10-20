package question;

import annotation.Backtracking;
import annotation.Maths;
import annotation.Strings;
import company.Facebook;

import java.util.ArrayList;
import java.util.List;

@Maths
@Strings
@Backtracking
@Facebook
public class Q282 {
    /*
    Time Complexity: O(4^n) Space Complexity: O(n)
     */
    public List<String> addOperators(String num, int target) {
        if (num.length() == 0) return new ArrayList<>();

        List<String> ans = new ArrayList<>();

        helper(num, target, 0, 0, "", ans);

        return ans;
    }

    private void helper(String num, int target, long eval, long multiplied, String expr, List<String> ans) {
        if (num.length() == 0 && eval == target) {
            ans.add(expr);
            return;
        }

        for (int i = 1; i <= num.length(); i++) {
            String curr = num.substring(0, i);

            if (curr.length() > 1 && curr.charAt(0) == '0') return;
            String next = num.substring(i);

            long currLong = Long.parseLong(curr);

            if (expr.length() > 0) {
                helper(next, target, eval + currLong, currLong, expr + "+" + currLong, ans);
                helper(next, target, eval - currLong, -currLong, expr + "-" + currLong, ans);
                helper(next, target, eval - multiplied + multiplied * currLong, multiplied * currLong, expr + "*" + currLong, ans);
            } else {
                helper(next, target, currLong, currLong, curr, ans);
            }
        }
    }
}

/*
282. Expression Add Operators
 */

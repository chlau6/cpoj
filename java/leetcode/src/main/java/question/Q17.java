package question;

import annotation.Backtracking;
import annotation.HashTable;
import annotation.Strings;
import company.Facebook;

import java.util.ArrayList;
import java.util.List;

@HashTable
@Strings
@Backtracking
@Facebook
public class Q17 {
    String[] mapping = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }

        List<String> ans = new ArrayList<>();
        helper(digits, ans, new StringBuilder(), 0);

        return ans;
    }

    private void helper(String digits, List<String> ans, StringBuilder builder, int index) {
        if (index == digits.length()) {
            ans.add(builder.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        String button = mapping[digit];
        for (int j = 0; j < button.length(); j++) {
            builder.append(button.charAt(j));
            helper(digits, ans, builder, index + 1);
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}

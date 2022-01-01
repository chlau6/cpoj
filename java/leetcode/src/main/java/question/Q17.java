package question;

import java.util.ArrayList;
import java.util.List;

public class Q17 {
    /*
    Time Complexity: O(4^n) Space Complexity: O(n * 4^n)
     */
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();

        List<String> result = new ArrayList<>();
        char[][] table = new char[][] {{' '}, {' '}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

        recursion(result, table, digits, "", 0);

        return result;
    }

    public void recursion(List<String> result, char[][] table, String digits, String str, int curr) {
        if (curr == digits.length()) {
            result.add(str);
            return;
        }

        for (Character c : table[digits.charAt(curr) - '0']) {
            recursion(result, table, digits, str + c, curr + 1);
        }
    }
}

/*
17. Letter Combinations of a Phone Number
 */

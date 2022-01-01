package question;

import java.util.List;

public class Q1773 {
    /*
    Time Complexity: O(mn)   Space Complexity: O(1)
     */
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;
        int key;

        if (ruleKey.equals("type")) key = 0;
        else if (ruleKey.equals("color")) key = 1;
        else key = 2;

        for (List<String> item : items) {
            if (item.get(key).equals(ruleValue)) result++;
        }

        return result;
    }
}

/*
1773. Count Items Matching a Rule
 */

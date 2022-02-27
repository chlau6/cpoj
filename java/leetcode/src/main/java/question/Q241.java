package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q241 {
    public List<Integer> diffWaysToCompute(String expression) {
        Map<String, List<Integer>> map = new HashMap<>();

        return helper(map, expression);
    }

    public List<Integer> helper(Map<String, List<Integer>> map, String expression) {
        if (map.containsKey(expression)) return map.get(expression);

        List<Integer> result = new ArrayList<>();
        int n = expression.length();

        for (int i = 0; i < n; i++) {
            char c = expression.charAt(i);

            if (c == '+' || c == '-' || c == '*') {
                List<Integer> left = helper(map, expression.substring(0, i));
                List<Integer> right = helper(map, expression.substring(i + 1));

                for (Integer l : left) {
                    for (Integer r : right) {
                        if (c == '+') {
                            result.add(l + r);
                        } else if (c == '-') {
                            result.add(l - r);
                        } else {
                            result.add(l * r);
                        }
                    }
                }
            }
        }

        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }

        map.put(expression, result);

        return result;
    }
}

/*
241. Different Ways to Add Parentheses
 */
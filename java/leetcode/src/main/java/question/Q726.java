package question;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Q726 {
    public String countOfAtoms(String formula) {
        Stack<TreeMap<String, Integer>> stack = new Stack<>();
        TreeMap<String, Integer> map = new TreeMap<>();

        int i = 0;
        int n = formula.length();

        while (i < n) {
            char c = formula.charAt(i++);

            if (c == '(') {
                stack.push(map);
                map = new TreeMap<>();
            } else if (c == ')') {
                int count = 0;

                while (i < n && Character.isDigit(formula.charAt(i))) {
                    count = count * 10 + formula.charAt(i++) - '0';
                }

                if (count == 0) {
                    count = 1;
                }

                TreeMap<String, Integer> parent = stack.pop();
                merge(parent, map, count);
                map = parent;
            } else {
                int start = i - 1;

                while (i < n && Character.isLowerCase(formula.charAt(i))) {
                    i++;
                }

                String element = formula.substring(start, i);

                int count = 0;

                while (i < n && Character.isDigit(formula.charAt(i))) {
                    count = count * 10 + formula.charAt(i++) - '0';
                }

                if (count == 0) {
                    count = 1;
                }

                map.put(element, map.getOrDefault(element, 0) + count);
            }
        }

        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String element = entry.getKey();
            int count = entry.getValue();

            builder.append(element);

            if (count > 1) {
                builder.append(count);
            }
        }

        return builder.toString();
    }

    public void merge(TreeMap<String, Integer> parent, TreeMap<String, Integer> child, int count) {
        for (Map.Entry<String, Integer> entry : child.entrySet()) {
            String key = entry.getKey();
            int val = entry.getValue();

            parent.put(key, parent.getOrDefault(key, 0) + count * val);
        }
    }
}

/*
726. Number of Atoms
 */

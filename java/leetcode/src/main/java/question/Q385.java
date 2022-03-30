package question;

import java.util.List;
import java.util.Stack;

public class Q385 {
    public class NestedInteger {
        // Constructor initializes an empty nested list.
        public NestedInteger() {

        }

        // Constructor initializes a single integer.
        public NestedInteger(int value) {

        }

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger() {
            return false;
        }

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger() {
            return null;
        }

        // Set this NestedInteger to hold a single integer.
        public void setInteger(int value) {

        }

        // Set this NestedInteger to hold a nested list and adds a nested integer to it.
        public void add(NestedInteger ni) {

        }

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return empty list if this NestedInteger holds a single integer
        public List<NestedInteger> getList() {
            return null;
        }
    }


    class Solution {
        public NestedInteger deserialize(String s) {
            if (s.isEmpty()) return new NestedInteger();
            if (s.charAt(0) != '[') return new NestedInteger(Integer.parseInt(s));

            Stack<NestedInteger> stack = new Stack<>();
            int start = 1;
            int n = s.length();

            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);

                if (c == '[') {
                    stack.push(new NestedInteger());
                    start = i + 1;
                }
                if (c == ',' || c == ']') {
                    if (i > start) {
                        stack.peek().add(new NestedInteger(Integer.parseInt(s.substring(start, i))));
                    }

                    start = i + 1;

                    if (c == ']' && stack.size() > 1) {
                        NestedInteger top = stack.pop();
                        stack.peek().add(top);
                    }
                }
            }

            return stack.peek();
        }
    }
}

/*
385. Mini Parser
 */

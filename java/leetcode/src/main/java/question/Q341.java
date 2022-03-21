package question;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Q341 {
    public interface NestedInteger {
        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger();

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger();

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return empty list if this NestedInteger holds a single integer
        public List<NestedInteger> getList();
    }

    public class NestedIterator implements Iterator<Integer> {
        Stack<NestedInteger> stack = new Stack<>();

        public NestedIterator(List<NestedInteger> nestedList) {
            prepare(nestedList);
        }

        @Override
        public Integer next() {
            NestedInteger nestedInteger = stack.pop();

            return nestedInteger.getInteger();
        }

        @Override
        public boolean hasNext() {
            while (!stack.empty()) {
                NestedInteger nestedInteger = stack.peek();

                if (nestedInteger.isInteger()) return true;

                stack.pop();
                prepare(nestedInteger.getList());
            }

            return false;
        }

        public void prepare(List<NestedInteger> nestedList) {
            int n = nestedList.size();
            System.out.println(n);
            for (int i = n - 1; i >= 0; i--) {
                stack.push(nestedList.get(i));
            }
        }
    }
}

/*
341. Flatten Nested List Iterator
 */

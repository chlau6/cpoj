package question;

import java.util.Stack;

public class Q155 {
    /*
    push:   Time Complexity: O(1)   Space Complexity: O(1)
    pop:    Time Complexity: O(1)   Space Complexity: O(1)
    top:    Time Complexity: O(1)   Space Complexity: O(1)
    getMin: Time Complexity: O(1)   Space Complexity: O(1)
     */
    class MinStack {
        Stack<Integer> stack;
        int min;

        public MinStack() {
            stack = new Stack<>();
            min = Integer.MAX_VALUE;
        }

        public void push(int val) {
            if (val <= min) {
                stack.push(min);
                min = val;
            }
            stack.push(val);
        }

        public void pop() {
            int temp = stack.pop();
            if (temp == min) {
                min = stack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min;
        }
    }
}

/*
155. Min Stack
 */
package question;

import annotation.Design;
import annotation.Queues;
import annotation.Stacks;

import java.util.Stack;

@Stacks
@Design
@Queues
public class Q232 {
    /*
    push:   Time Complexity: O(1)   Space Complexity: O(1)
    pop:    Time Complexity: O(n)   Space Complexity: O(1)
    peek:   Time Complexity: O(n)   Space Complexity: O(1)
    empty:  Time Complexity: O(1)   Space Complexity: O(1)
     */
    class MyQueue {
        Stack<Integer> oldStack = new Stack<>();
        Stack<Integer> newStack = new Stack<>();

        public MyQueue() {
        }

        public void push(int x) {
            newStack.push(x);
        }

        public int pop() {
            shiftStack();
            return oldStack.pop();
        }

        public int peek() {
            shiftStack();
            return oldStack.peek();
        }

        public boolean empty() {
            return oldStack.isEmpty() && newStack.isEmpty();
        }

        private void shiftStack() {
            if (!oldStack.isEmpty()) return;

            while (!newStack.isEmpty()) {
                oldStack.push(newStack.pop());
            }
        }
    }
}

/*
232. Implement Queue using Stacks
 */

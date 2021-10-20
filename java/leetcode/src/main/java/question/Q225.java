package question;

import annotation.Design;
import annotation.Queues;
import annotation.Stacks;

import java.util.LinkedList;
import java.util.Queue;

@Stacks
@Design
@Queues
public class Q225 {
    /*
    push:   Time Complexity: O(n)   Space Complexity: O(1)
    pop:    Time Complexity: O(1)   Space Complexity: O(1)
    top:    Time Complexity: O(1)   Space Complexity: O(1)
    empty:  Time Complexity: O(1)   Space Complexity: O(1)
     */
    class MyStack {
        Queue<Integer> queue = new LinkedList<>();

        public MyStack() {
        }

        public void push(int x) {
            queue.add(x);

            int size = queue.size();
            for (int i = 0; i < size - 1; i++) {
                queue.add(queue.remove());
            }
        }

        public int pop() {
            return queue.remove();
        }

        public int top() {
            return queue.element();
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }
}

/*
225. Implement Stack using Queues
 */

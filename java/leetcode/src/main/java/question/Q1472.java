package question;

import java.util.Stack;

public class Q1472 {
    class BrowserHistory {
        Stack<String> backward = new Stack<>();
        Stack<String> forward = new Stack<>();

        public BrowserHistory(String homepage) {
            backward.push(homepage);
        }

        public void visit(String url) {
            forward.clear();
            backward.push(url);
        }

        public String back(int steps) {
            while (backward.size() > 1 && steps > 0) {
                forward.push(backward.pop());
                steps--;
            }

            return backward.peek();
        }

        public String forward(int steps) {
            while (!forward.isEmpty() && steps > 0) {
                backward.push(forward.pop());
                steps--;
            }

            return backward.peek();
        }
    }
}

/*
1472. Design Browser History
 */

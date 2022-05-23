package question;

import java.util.List;
import java.util.Stack;

public class Q636 {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        int prev = 0;

        for (String log : logs) {
            String[] split = log.split(":");

            int id = Integer.parseInt(split[0]);
            int time = Integer.parseInt(split[2]);

            if (split[1].equals("start")) {
                if (!stack.isEmpty()) {
                    result[stack.peek()] += time - prev;
                }

                prev = time;
                stack.push(id);

            } else {
                result[stack.pop()] += time - prev + 1;
                prev = time + 1;
            }
        }

        return result;
    }
}

/*
636. Exclusive Time of Functions
 */

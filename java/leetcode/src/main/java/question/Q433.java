package question;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Q433 {
    public int minMutation(String start, String end, String[] bank) {
        int result = 0;
        char[] choices = new char[]{'A', 'C', 'G', 'T'};
        Set<String> set = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        q.add(start);

        for (String s : bank) {
            set.add(s);
        }

        while (!q.isEmpty()) {
            int n = q.size();

            for (int i = 0; i < n; i++) {
                String t = q.poll();

                if (t.equals(end)) return result;

                char[] temp = t.toCharArray();
                for (int j = 0; j < temp.length; j++) {
                    char old = temp[j];

                    for (char c : choices) {
                        temp[j] = c;

                        String mutation = String.valueOf(temp);

                        if (set.contains(mutation)) {
                            q.add(mutation);
                            set.remove(mutation);
                        }
                    }

                    temp[j] = old;
                }
            }

            result++;
        }

        return -1;
    }
}
/*
433. Minimum Genetic Mutation
 */

package question;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Q752 {
    public int openLock(String[] deadends, String target) {
        Set<String> set = new HashSet<>();
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        int step = 0;

        for (String d : deadends) {
            set.add(d);
        }

        q.add("0000");
        visited.add("0000");

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String s = q.poll();

                if (set.contains(s)) {
                    continue;
                }

                if (s.equals(target)) return step;

                StringBuilder builder = new StringBuilder(s);
                for (int j = 0; j < 4; j++) {
                    char c = builder.charAt(j);

                    char c1 = (c == '9' ? '0' : (char) (c + 1));
                    char c2 = (c == '0' ? '9' : (char) (c - 1));

                    builder.setCharAt(j, c1);
                    String s1 = builder.toString();

                    if (!visited.contains(s1) && !set.contains(s1)) {
                        q.add(s1);
                        visited.add(s1);
                    }


                    builder.setCharAt(j, c2);
                    String s2 = builder.toString();

                    if (!visited.contains(s2) && !set.contains(s2)) {
                        q.add(s2);
                        visited.add(s2);
                    }

                    builder.setCharAt(j, c);
                }
            }

            step++;
        }

        return -1;
    }
}

/*
752. Open the Lock
 */

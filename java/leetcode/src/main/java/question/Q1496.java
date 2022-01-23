package question;

import java.util.HashSet;
import java.util.Set;

public class Q1496 {
    public boolean isPathCrossing(String path) {
        Set<Integer> set = new HashSet<>();
        set.add(0);

        int x = 0;
        int y = 0;

        for (char c : path.toCharArray()) {
            if (c == 'N') {
                y++;
            } else if (c == 'S') {
                y--;
            } else if (c == 'E') {
                x++;
            } else {
                x--;
            }

            if (!set.add(x * 10001 + y)) return true;
        }

        return false;
    }
}

/*
1496. Path Crossing
 */

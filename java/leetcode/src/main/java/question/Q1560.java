package question;

import java.util.ArrayList;
import java.util.List;

public class Q1560 {
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> result = new ArrayList<>();
        int length = rounds.length;

        for (int i = rounds[0]; i <= rounds[length - 1]; i++) {
            result.add(i);
        }

        if (result.size() > 0) return result;

        for (int i = 1; i <= rounds[length - 1]; i++) {
            result.add(i);
        }

        for (int i = rounds[0]; i <= n; i++) {
            result.add(i);
        }

        return result;
    }
}

/*
1560. Most Visited Sector in a Circular Track
 */

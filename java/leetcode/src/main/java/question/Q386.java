package question;

import java.util.ArrayList;
import java.util.List;

public class Q386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            dfs(result, i, n);
        }

        return result;
    }

    public void dfs(List<Integer> list, int num, int n) {
        if (num > n) return;

        list.add(num);

        for (int i = 0; i <= 9; i++) {
            int t = num * 10 + i;

            if (t > n) return;

            dfs(list, t, n);
        }
    }
}

/*
386. Lexicographical Numbers
 */

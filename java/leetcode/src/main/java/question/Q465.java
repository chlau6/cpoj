package question;

import java.util.HashMap;
import java.util.Map;

public class Q465 {
    int result = 0;

    public int minTransfers(int[][] transactions) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int[] t : transactions) {
            map.put(t[0], map.getOrDefault(t[0], 0) - t[2]);
            map.put(t[1], map.getOrDefault(t[1], 0) + t[2]);
        }

        int[] account = new int[map.size()];

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int person = entry.getKey();
            int netAmount = entry.getValue();

            account[person] = netAmount;
        }

        helper(account, 0);

        return result;
    }

    public int helper(int[] account, int person) {
        int n = account.length;

        while (person < account.length && account[person] == 0) {
            person++;
        }

        if (person == n) {
            return 0;
        }

        int minTransactions = Integer.MAX_VALUE;

        for (int i = person + 1; i < n; i++) {
            if (account[i] * account[person] < 0) {
                account[i] += account[person];
                minTransactions = Math.min(minTransactions, helper(account, person + 1) + 1);
                account[i] -= account[person];
            }
        }

        return person;
    }
}

/*
465. Optimal Account Balancing
 */

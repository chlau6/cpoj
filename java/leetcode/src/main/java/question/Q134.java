package question;

public class Q134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int global = 0;
        int local = 0;
        int start = 0;
        int n = gas.length;

        for (int i = 0; i < n; i++) {
            global += gas[i] - cost[i];
            local += gas[i] - cost[i];

            if (local < 0) {
                start = i + 1;
                local = 0;
            }
        }

        return (global < 0) ? -1 : start;
    }
}

/*
134. Gas Station
 */

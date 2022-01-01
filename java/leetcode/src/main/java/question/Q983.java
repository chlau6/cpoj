package question;

public class Q983 {
    /*
    Time Complexity: O(lastDay)   Space Complexity: O(lastDay)
     */
    public int mincostTickets(int[] days, int[] costs) {
        int lastDay = days[days.length - 1];

        int[] minCost = new int[lastDay + 1];
        boolean[] dayVisited = new boolean[lastDay + 1];

        for (int day : days) {
            dayVisited[day] = true;
        }

        for (int i = 1; i <= lastDay; i++) {
            if (!dayVisited[i]) {
                minCost[i] = minCost[i - 1];
                continue;
            }

            int min = minCost[Math.max(0, i - 1)] + costs[0];
            min = Math.min(minCost[Math.max(0, i - 7)] + costs[1], min);
            min = Math.min(minCost[Math.max(0, i - 30)] + costs[30], min);

            minCost[i] = min;
        }

        return minCost[lastDay];
    }
}

/*
983. Minimum Cost For Tickets
 */

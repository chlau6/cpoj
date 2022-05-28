package question;

import java.util.Arrays;

public class Q881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int n = people.length;
        int i = 0;
        int j = n - 1;
        int result = 0;

        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
            }

            j--;
            result++;
        }

        return result;
    }
}

/*
881. Boats to Save People
 */

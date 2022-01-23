package question;

import java.util.ArrayList;
import java.util.List;

public class Q1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;

        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }
}

/*
1431. Kids With the Greatest Number of Candies
 */

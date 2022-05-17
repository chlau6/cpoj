package question;

import java.util.ArrayList;
import java.util.List;

public class Q1333 {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<int[]> list = new ArrayList<>();

        for (int[] rest : restaurants) {
            if (rest[2] == 0 && veganFriendly == 1) continue;

            if (rest[3] > maxPrice) continue;

            if (rest[4] > maxDistance) continue;

            list.add(rest);
        }

        list.sort((a, b) -> a[1] == b[1] ? b[0] - a[0] : b[1] - a[1]);

        List<Integer> result = new ArrayList<>();

        for (int[] rest : list) {
            result.add(rest[0]);
        }

        return result;
    }
}

/*
1333. Filter Restaurants by Vegan-Friendly, Price and Distance
 */

package question;

import java.util.ArrayList;
import java.util.List;

public class Q1282 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;
        List<List<Integer>> map = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n + 1; i++) {
            map.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            int g = groupSizes[i];

            List<Integer> list = map.get(g);
            list.add(i);

            if (list.size() == g) {
                result.add(new ArrayList<>(list));
                list.clear();
            }
        }

        return result;
    }
}

/*
1282. Group the People Given the Group Size They Belong To
 */

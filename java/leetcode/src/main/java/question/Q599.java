package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < list2.length; i++) {
            map.put(list2[i], i);
        }

        for (int i = 0; i < list1.length; i++) {
            if (map.containsKey(list1[i])) {
                int sum = map.get(list1[i]) + i;

                if (sum <= minimum) {
                    if (sum < minimum) list.clear();
                    list.add(list1[i]);
                    minimum = sum;
                }
            }
        }

        return list.toArray(new String[0]);
    }
}

/*
599. Minimum Index Sum of Two Lists
 */

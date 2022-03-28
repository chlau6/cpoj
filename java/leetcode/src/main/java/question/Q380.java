package question;

import java.util.*;

public class Q380 {
    class RandomizedSet {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        public RandomizedSet() {

        }

        public boolean insert(int val) {
            if (map.containsKey(val)) return false;
            list.add(val);
            map.put(val, list.size() - 1);

            return true;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val)) return false;

            int tail = list.get(list.size() - 1);
            int valuePos = map.get(val);
            map.put(tail, valuePos);
            list.set(valuePos, tail);
            list.remove(list.size() - 1);
            map.remove(val);

            return true;
        }

        public int getRandom() {
            return list.get(random.nextInt(list.size()));
        }
    }
}

/*
380. Insert Delete GetRandom O(1)
 */

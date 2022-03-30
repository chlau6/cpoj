package question;

import java.util.*;

public class Q381 {
    class RandomizedCollection {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Set<Integer>> map = new HashMap<>();
        Random random = new Random();

        public RandomizedCollection() {

        }

        public boolean insert(int val) {
            Set<Integer> set = map.computeIfAbsent(val, key -> new HashSet<>());
            set.add(list.size());
            list.add(val);

            return set.size() == 1;
        }

        public boolean remove(int val) {
            Set<Integer> set = map.computeIfAbsent(val, key -> new HashSet<>());

            if (set.size() == 0) return false;

            int index = set.iterator().next();
            int last = list.size() - 1;
            set.remove(index);

            if (index != last) {
                int tail = list.get(last);
                map.get(tail).remove(last);
                map.get(tail).add(index);
                list.set(index, tail);
            }

            list.remove(last);

            return true;
        }

        public int getRandom() {
            return list.get(random.nextInt(list.size()));
        }
    }
}

/*
381. Insert Delete GetRandom O(1) - Duplicates allowed
*/

package question;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Q460 {
    class LFUCache {
        Map<Integer, Integer> cache = new HashMap<>();
        Map<Integer, Integer> counts = new HashMap<>();
        Map<Integer, LinkedHashSet<Integer>> lists = new HashMap<>();
        int maxCapacity;
        int min = -1;

        public LFUCache(int capacity) {
            maxCapacity = capacity;
            lists.put(1, new LinkedHashSet<>());
        }

        public int get(int key) {
            if (!cache.containsKey(key)) return -1;

            int count = counts.get(key);
            counts.put(key, count + 1);

            LinkedHashSet<Integer> set = lists.get(count);
            set.remove(key);

            if (count == min && set.size() == 0) {
                min++;
            }

            lists.computeIfAbsent(count + 1, k -> new LinkedHashSet<>()).add(key);

            return cache.get(key);
        }

        public void put(int key, int value) {
            if (maxCapacity == 0) return;

            if (get(key) != -1) {
                cache.put(key, value);
                return;
            }

            if (cache.size() >= maxCapacity) {
                LinkedHashSet<Integer> lfuSet = lists.get(min);
                int lfuValue = lfuSet.iterator().next();
                lfuSet.remove(lfuValue);
                cache.remove(lfuValue);
            }

            cache.put(key, value);
            counts.put(key, 1);
            min = 1;
            lists.get(1).add(key);
        }
    }
}

/*
460. LFU Cache
 */

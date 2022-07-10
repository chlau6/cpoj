package question;

import java.util.Map;
import java.util.TreeMap;

public class Q2276 {
    class CountIntervals {
        int count = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();

        public CountIntervals() {

        }

        public void add(int left, int right) {
            int start = left;
            int end = right;
            int add = right - left + 1;

            Map.Entry<Integer, Integer> floor = map.floorEntry(left);


            if (floor != null) {
                int s = floor.getKey();
                int e = floor.getValue();

                if (end <= e) {
                    return;
                }

                if (start <= e) {
                    add -= e - start + 1;
                    map.remove(s);
                    start = s;
                }
            }

            Map.Entry<Integer, Integer> ceiling = map.ceilingEntry(left);

            while (ceiling != null && ceiling.getKey() <= end) {
                int s = ceiling.getKey();
                int e = ceiling.getValue();

                add -= Math.min(end, e) - s + 1;
                end = Math.max(e, end);
                map.remove(s);
                ceiling = map.ceilingEntry(start);
            }

            map.put(start, end);

            count += add;
        }

        public int count() {
            return count;
        }
    }
}

/*
2265. Count Nodes Equal to Average of Subtree
 */

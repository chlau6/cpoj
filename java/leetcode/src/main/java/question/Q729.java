package question;

import java.util.Map;
import java.util.TreeMap;

public class Q729 {
    class MyCalendar {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        public MyCalendar() {

        }

        public boolean book(int start, int end) {
            Map.Entry<Integer, Integer> e1 = map.floorEntry(start);
            Map.Entry<Integer, Integer> e2 = map.ceilingEntry(start);

            if (e1 != null) {
                int e = e1.getValue();
                if (start < e) return false;
            }

            if (e2 != null) {
                int s = e2.getKey();
                if (s < end) return false;
            }

            map.put(start, end);
            return true;
        }
    }
}

/*
729. My Calendar I
 */

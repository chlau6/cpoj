package question;

import java.util.ArrayList;
import java.util.List;

public class Q1656 {
    class OrderedStream {
        int pointer = 0;
        String[] array;
        int n;

        public OrderedStream(int n) {
            this.array = new String[n];
            this.n = n;
        }

        public List<String> insert(int idKey, String value) {
            array[idKey - 1] = value;

            List<String> result = new ArrayList<>();

            while (pointer < n && array[pointer] != null) {
                result.add(array[pointer]);
                pointer++;
            }

            return result;
        }
    }
}

/*
1656. Design an Ordered Stream
 */

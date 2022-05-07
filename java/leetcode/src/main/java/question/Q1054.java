package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q1054 {
    public int[] rearrangeBarcodes(int[] barcodes) {
        int n = barcodes.length;
        Map<Integer, Integer> map = new HashMap<>();
        List<int[]> list = new ArrayList<>();
        int[] result = new int[n];

        for (int barcode : barcodes) {
            map.compute(barcode, (k, v) -> v == null ? 1 : v + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int k = entry.getKey();
            int v = entry.getValue();

            list.add(new int[]{v, k});
        }

        list.sort((a, b) -> b[0] - a[0]);

        int pos = 0;
        for (int[] a : list) {
            int times = a[0];

            for (int i = 0; i < times; i++) {
                result[pos] = a[1];
                pos += 2;

                if (pos >= n) pos = 1;
            }
        }

        return result;
    }
}

/*
1054. Distant Barcodes
 */

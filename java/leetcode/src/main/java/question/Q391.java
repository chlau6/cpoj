package question;

import java.util.HashSet;
import java.util.Set;

public class Q391 {
    public boolean isRectangleCover(int[][] rectangles) {
        int x1 = Integer.MAX_VALUE;
        int y1 = Integer.MAX_VALUE;
        int x2 = Integer.MIN_VALUE;
        int y2 = Integer.MIN_VALUE;

        Set<String> set = new HashSet<>();
        int area = 0;

        for (int[] r : rectangles) {
            x1 = Math.min(r[0], x1);
            y1 = Math.min(r[1], y1);
            x2 = Math.max(r[2], x2);
            y2 = Math.max(r[3], y2);

            area += (r[2] - r[0]) * (r[3] - r[1]);

            String s1 = r[0] + " " + r[1];
            String s2 = r[0] + " " + r[3];
            String s3 = r[2] + " " + r[1];
            String s4 = r[2] + " " + r[3];

            if (!set.add(s1)) set.remove(s1);
            if (!set.add(s2)) set.remove(s2);
            if (!set.add(s3)) set.remove(s3);
            if (!set.add(s4)) set.remove(s4);
        }

        String s1 = x1 + " " + y1;
        String s2 = x1 + " " + y2;
        String s3 = x2 + " " + y1;
        String s4 = x2 + " " + y2;

        if (!set.contains(s1) || !set.contains(s2) || !set.contains(s3) || !set.contains(s4) || set.size() != 4)
            return false;

        return area == (x2 - x1) * (y2 - y1);
    }
}

/*
391. Perfect Rectangle
 */

package question;

import java.util.Random;
import java.util.TreeMap;

public class Q497 {
    class Solution {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        int[][] rects;
        int totalArea = 0;
        Random random = new Random();

        public Solution(int[][] rects) {
            this.rects = rects;

            for (int[] rect : rects) {
                totalArea += (rect[2] - rect[0] + 1) * (rect[3] - rect[1] + 1);
                treeMap.put(totalArea, treeMap.size());
            }
        }

        public int[] pick() {
            int value = random.nextInt(totalArea);
            int index = treeMap.ceilingEntry(value).getValue();
            int width = rects[index][2] - rects[index][0] + 1;
            int length = rects[index][3] - rects[index][1] + 1;

            return new int[]{random.nextInt(width) + rects[index][0], random.nextInt(length) + rects[index][1]};
        }
    }
}

/*
497. Random Point in Non-overlapping Rectangles
 */

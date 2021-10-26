package question;

import annotation.Backtracking;
import annotation.BitManipulation;

import java.util.ArrayList;
import java.util.List;

@Backtracking
@BitManipulation
public class Q401 {
    /*
    Time Complexity: O(11 * 60 * n)  Space Complexity: O(n)
     */
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (Integer.bitCount((i << 6) + j) == turnedOn) {
                    result.add(i + (j < 10 ? ":0" : ":") + j);
                }
            }
        }

        return result;
    }
}

/*
401. Binary Watch
 */

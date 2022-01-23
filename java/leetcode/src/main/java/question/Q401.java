package question;

import java.util.ArrayList;
import java.util.List;

public class Q401 {
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

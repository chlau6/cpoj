package question;

import annotation.Array;
import annotation.Sorting;
import annotation.Strings;

import java.util.ArrayList;
import java.util.List;

@Array
@Strings
@Sorting
public class Q937 {
    /*
    ping:   Time Complexity: O(n log n)   Space Complexity: O(n)
     */
    public String[] reorderLogFiles(String[] logs) {
        List<String> digitLogs = new ArrayList<>();
        List<String[]> letterLogs = new ArrayList<>();
        String[] result = new String[logs.length];

        for (String log : logs) {
            String[] word = log.split(" ", 2);

            if (Character.isAlphabetic(word[1].charAt(0))) {
                digitLogs.add(log);
            } else {
                letterLogs.add(word);
            }
        }

        letterLogs.sort((s1, s2) -> {
            int compareResult = s1[1].compareTo(s2[1]);
            if (compareResult == 0) return s1[0].compareTo(s2[0]);
            else return compareResult;
        });

        int i = 0;

        for (String[] log : letterLogs) {
            result[i++] = log[0] + log[1];
        }

        for (String log : digitLogs) {
            result[i++] = log;
        }

        return result;
    }
}

/*
937. Reorder Data in Log Files
 */

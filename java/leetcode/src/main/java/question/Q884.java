package question;

import annotation.HashTable;
import annotation.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@HashTable
@Strings
public class Q884 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> counts = new HashMap<>();

        String combined = s1 + " " + s2;

        for (String str : combined.split("\\s+")) {
            counts.put(str, counts.getOrDefault(str, 0) + 1);
        }

        List<String> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }

        return list.toArray(new String[0]);
    }
}

/*
884. Uncommon Words from Two Sentences
 */

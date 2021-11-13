package question;

import annotation.HashTable;
import annotation.Strings;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@HashTable
@Strings
public class Q1436 {
    /*
    Time Complexity: O(n)  Space Complexity: O(n)
     */
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();

        for (List<String> path : paths) {
            set.add(path.get(1));
        }

        for (List<String> path : paths) {
            set.remove(path.get(0));
        }

        return set.iterator().next();
    }
}

/*
1436. Destination City
 */

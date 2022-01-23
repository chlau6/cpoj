package question;

import java.util.HashSet;
import java.util.Set;

public class Q1346 {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num * 2) || num % 2 == 0 && set.contains(num / 2)) return true;

            set.add(num);
        }

        return false;
    }
}

/*
1346. Check If N and Its Double Exist
 */

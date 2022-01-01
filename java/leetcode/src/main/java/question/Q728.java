package question;

import java.util.ArrayList;
import java.util.List;

public class Q728 {
    /*
    Time Complexity: O(n log m)   Space Complexity: O(n)
     */
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int num = i;

            while (num > 0) {
                int digit = num % 10;
                if (digit == 0 || i % digit != 0) break;
                num /= 10;
            }

            if (num == 0) result.add(i);
        }

        return result;
    }
}

/*
728. Self Dividing Numbers
 */

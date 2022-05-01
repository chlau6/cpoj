package question;

import java.util.LinkedList;
import java.util.List;

public class Q2197 {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        LinkedList<Integer> result = new LinkedList<>();

        for (int num : nums) {
            while (true) {
                int last = result.isEmpty() ? 1 : result.getLast();
                int gcd = gcd(last, num);

                if (gcd == 1) break;
                num *= result.removeLast() / gcd;
            }

            result.addLast(num);
        }

        return result;
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}

/*
2197. Replace Non-Coprime Numbers in Array
 */

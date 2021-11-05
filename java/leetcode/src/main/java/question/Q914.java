package question;

import annotation.*;

import java.util.HashMap;
import java.util.Map;

@Array
@HashTable
@Maths
@Counting
@NumberTheory
public class Q914 {
    /*
    Time Complexity: O(n)  Space Complexity: O(n)
     */
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for (int d : deck) {
            map.put(d, map.getOrDefault(d, 0) + 1);
        }

        for (int count : map.values()) {
            result = gcd(count, result);
        }

        return result > 1;
    }

    public int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }
}

/*
914. X of a Kind in a Deck of Cards
 */

package question;

import annotation.Maths;
import annotation.Simulation;
import annotation.Strings;

import java.util.ArrayList;
import java.util.List;

@Maths
@Strings
@Simulation
public class Q412 {
    /*
    Time Complexity: O(n)  Space Complexity: O(n)
     */
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }
}

/*
412. Fizz Buzz
 */

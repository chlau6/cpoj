package question;

import annotation.Maths;
import annotation.NumberTheory;
import annotation.Simulation;

@Maths
@Simulation
@NumberTheory
public class Q258 {
    /*
    Time Complexity: O(1)   Space Complexity: O(1)
     */
    public int addDigits(int num) {
        return (num == 0) ? 0 : (num - 1) % 9 + 1;
    }
}

/*
258. Add Digits
 */
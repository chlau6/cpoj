package question;

import annotation.Brainteaser;
import annotation.DynamicProgramming;
import annotation.GameTheory;
import annotation.Maths;

@Maths
@DynamicProgramming
@Brainteaser
@GameTheory
public class Q1025 {
    /*
    Time Complexity: O(1)   Space Complexity: O(1)
     */
    public boolean divisorGame(int n) {
        return n % 2 == 0;
    }
}

/*
1025. Divisor Game
 */

package question;

import annotation.Brainteaser;
import annotation.GameTheory;
import annotation.Maths;

@Maths
@Brainteaser
@GameTheory
public class Q292 {
    /*
    Time Complexity: O(1)   Space Complexity: O(1)
     */
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}

/*
292. Nim Game
 */

package question;

import annotation.Maths;
import annotation.Strings;

@Maths
@Strings
public class Q1812 {
    /*
    Time Complexity: O(1)   Space Complexity: O(1)
     */
    public boolean squareIsWhite(String coordinates) {
        return coordinates.charAt(0) % 2 != coordinates.charAt(1) % 2;
    }
}

/*
1812. Determine Color of a Chessboard Square
 */

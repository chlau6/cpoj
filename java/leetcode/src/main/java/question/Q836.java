package question;

import annotation.Geometry;
import annotation.Maths;

@Maths
@Geometry
public class Q836 {
    /*
    Time Complexity: O(1)   Space Complexity: O(1)
     */
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return rec1[0] < rec2[2] && rec2[0] < rec1[2] && rec1[1] < rec2[3] && rec2[1] < rec1[3];
    }
}

/*
836. Rectangle Overlap
 */

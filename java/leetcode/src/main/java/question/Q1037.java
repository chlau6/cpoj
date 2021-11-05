package question;

import annotation.Geometry;
import annotation.Maths;

@Maths
@Geometry
public class Q1037 {
    /*
    Time Complexity: O(1)   Space Complexity: O(1)
     */
    public boolean isBoomerang(int[][] points) {
        return (points[1][1] - points[0][1]) * (points[2][0] - points[0][0]) == (points[2][1] - points[0][1]) * (points[1][0] - points[0][0]);
    }
}

/*
1037. Valid Boomerang
 */

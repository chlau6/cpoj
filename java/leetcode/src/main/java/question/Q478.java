package question;

public class Q478 {
    class Solution {
        double r;
        double x;
        double y;

        public Solution(double radius, double x_center, double y_center) {
            r = radius;
            x = x_center;
            y = y_center;

        }

        public double[] randPoint() {
            double theta = 2 * Math.PI * Math.random();
            double length = Math.sqrt(Math.random()) * r;

            return new double[]{x + length * Math.cos(theta), y + length * Math.sin(theta)};
        }
    }
}

/*
478. Generate Random Point in a Circle
 */

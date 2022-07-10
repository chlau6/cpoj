package question;

import java.util.Arrays;

public class Q2126 {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long m = mass;

        for (int a : asteroids) {
            if (m >= a) {
                m += a;
            } else {
                return false;
            }
        }

        return true;
    }
}
/*
2126. Destroying Asteroids
 */

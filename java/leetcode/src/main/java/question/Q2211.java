package question;

public class Q2211 {
    public int countCollisions(String directions) {
        int n = directions.length();
        int left = 0;
        int right = n - 1;
        int result = 0;

        while (left < n && directions.charAt(left) == 'L') {
            left++;
        }

        while (right >= 0 && directions.charAt(right) == 'R') {
            right--;
        }

        for (int i = left; i <= right; i++) {
            if (directions.charAt(i) != 'S') {
                result++;
            }
        }

        return result;
    }
}

/*
2248. Intersection of Multiple Arrays
 */

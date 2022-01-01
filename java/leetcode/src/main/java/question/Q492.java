package question;

public class Q492 {
    /*
    Time Complexity: O(sqrt(n))   Space Complexity: O(1)
     */
    public int[] constructRectangle(int area) {
        int i = (int) Math.sqrt(area);

        while (area % i != 0) i--;

        return new int[] {area / i, i};
    }
}

/*
492. Construct the Rectangle
 */

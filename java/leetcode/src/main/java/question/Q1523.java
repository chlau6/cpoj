package question;

public class Q1523 {
    /*
    Time Complexity: O(1)  Space Complexity: O(1)
     */
    public int countOdds(int low, int high) {
        if (low % 2 != 0) low--;
        if (high % 2 != 0) high++;

        return (high - low) / 2;
    }
}

/*
1523. Count Odd Numbers in an Interval Range
 */

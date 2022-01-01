package question;

public class Q1518 {
    /*
    Time Complexity: O(1)  Space Complexity: O(1)
     */
    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles + (numBottles - 1) / (numExchange - 1);
    }
}

/*
1518. Water Bottles
 */

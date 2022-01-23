package question;

public class Q1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles + (numBottles - 1) / (numExchange - 1);
    }
}

/*
1518. Water Bottles
 */

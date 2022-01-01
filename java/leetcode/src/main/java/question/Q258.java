package question;

public class Q258 {
    /*
    Time Complexity: O(1)   Space Complexity: O(1)
     */
    public int addDigits(int num) {
        return (num == 0) ? 0 : (num - 1) % 9 + 1;
    }
}

/*
258. Add Digits
 */
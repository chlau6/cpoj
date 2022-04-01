package question;

public class Q2169 {
    public int countOperations(int num1, int num2) {
        if (num1 == 0 || num2 == 0) return 0;

        return num1 / num2 + countOperations(num2, num1 % num2);
    }
}

/*
2169. Count Operations to Obtain Zero
 */

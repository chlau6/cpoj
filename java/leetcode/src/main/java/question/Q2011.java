package question;

public class Q2011 {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;

        for (String op : operations) {
            result += (op.charAt(0) == '+' || op.charAt(2) == '+') ? 1 : -1;
        }

        return result;
    }
}
/*
2011. Final Value of Variable After Performing Operations
 */

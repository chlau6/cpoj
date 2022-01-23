package question;

public class Q1796 {
    public int secondHighest(String s) {
        int largest = -1;
        int secondLargest = -1;

        for (char c : s.toCharArray()) {
            if (c < '0' || c > '9') continue;

            int num = c - '0';

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}

/*
1796. Second Largest Digit in a String
 */

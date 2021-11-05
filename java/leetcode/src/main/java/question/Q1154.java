package question;

import annotation.Maths;
import annotation.Strings;

@Maths
@Strings
public class Q1154 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int dayOfYear(String date) {
        int[] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        if (isLeap(year)) {
            days[1]++;
        }

        int result = 0;

        for (int i = 0; i < month - 1; i++) {
            result += days[i];
        }

        return result + day;
    }

    public boolean isLeap(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
}

/*
1154. Day of the Year
 */

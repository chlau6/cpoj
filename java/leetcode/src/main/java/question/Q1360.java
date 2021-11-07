package question;

import annotation.*;

@Maths
@Strings
public class Q1360 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(daysSince1971(date1) - daysSince1971(date2));
    }

    public int daysSince1971(String date) {
        int[] days = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int total = 0;

        for (int i = 1971; i < year; i++) {
            total += isLeap(i) ? 366 : 365;
        }

        for (int i = 1; i < month; i++) {
            total += days[i];
        }

        if (isLeap(year) && month > 2) total += 1;

        return total + day;
    }

    public boolean isLeap(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}

/*
1360. Number of Days Between Two Dates
 */

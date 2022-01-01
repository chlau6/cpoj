package question;

public class Q1185 {
    /*
    Time Complexity: O(1)   Space Complexity: O(1)
     */
    public String dayOfTheWeek(int day, int month, int year) {
        String[] weekdays = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        if (month <= 2) {
            month += 12;
            year -= 1;
        }

        int m = month;
        int c = year / 100;
        int y = year % 100;
        int d = day;

        int w = (y + y / 4 + c / 4 - 2 * c + 26 * (m + 1) / 10 + d - 1) % 7;

        return weekdays[(w + 7) % 7];
    }
}

/*
1185. Day of the Week
 */

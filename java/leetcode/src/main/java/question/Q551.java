package question;

public class Q551 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);

            if (c == 'A') {
                if (++absent > 1) return false;
                late = 0;
            } else if (c == 'L') {
                if (++late > 2) return false;
            } else {
                late = 0;
            }
        }

        return true;
    }
}

/*
551. Student Attendance Record I
 */

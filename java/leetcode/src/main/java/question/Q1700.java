package question;

public class Q1700 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int countStudents(int[] students, int[] sandwiches) {
        int[] counts = new int[2];

        for (int student : students) {
            counts[student]++;
        }

        int n = sandwiches.length;
        int i;

        for (i = 0; i < n; i++) {
            if (counts[sandwiches[i]] <= 0) {
                break;
            }
            counts[sandwiches[i]]--;
        }

        return n - i;
    }
}

/*
1700. Number of Students Unable to Eat Lunch
 */

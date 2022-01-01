package question;

public class Q1189 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int maxNumberOfBalloons(String text) {
        int[] counts = new int[26];
        int length = text.length();

        for (int i = 0; i < length; i++) {
            counts[text.charAt(i) - 'a']++;
        }

        int min = counts[1];
        min = Math.min(min, counts[0]);
        min = Math.min(min, counts[11] / 2);
        min = Math.min(min, counts[14] / 2);
        min = Math.min(min, counts[13]);

        return min;
    }
}

/*
1189. Maximum Number of Balloons
 */

package question;

public class Q744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int length = letters.length;

        if (target >= letters[length - 1]) return letters[0];

        int left = 0;
        int right = length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return letters[left];
    }
}

/*
744. Find Smallest Letter Greater Than Target
 */

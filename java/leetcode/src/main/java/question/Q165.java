package question;

public class Q165 {
    public int compareVersion(String version1, String version2) {
        char[] v1 = version1.toCharArray();
        char[] v2 = version2.toCharArray();
        int n1 = v1.length;
        int n2 = v2.length;
        int num1 = 0;
        int num2 = 0;
        int i = 0;
        int j = 0;

        while (i < n1 || j < n2) {
            while (i < n1 && v1[i] != '.') {
                num1 = num1 * 10 + v1[i++] - '0';
            }

            while (j < n2 && v2[j] != '.') {
                num2 = num2 * 10 + v2[j++] - '0';
            }

            if (num1 < num2) {
                return -1;
            } else if (num1 > num2) {
                return 1;
            }

            num1 = num2 = 0;
            i++;
            j++;
        }

        return 0;
    }
}

/*
165. Compare Version Numbers
 */
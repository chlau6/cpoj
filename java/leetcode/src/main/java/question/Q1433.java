package question;

public class Q1433 {
    public boolean checkIfCanBreak(String s1, String s2) {
        int[] o1 = new int[26];
        int[] o2 = new int[26];
        int n = s1.length();

        for (int i = 0; i < n; i++) {
            o1[s1.charAt(i) - 'a']++;
            o2[s2.charAt(i) - 'a']++;
        }

        int count1 = 0;
        int count2 = 0;
        boolean aLead = false;
        boolean bLead = false;

        for (int i = 0; i < 26; i++) {
            count1 += o1[i];
            count2 += o2[i];

            if (count1 > count2) {
                if (bLead) return false;
                aLead = true;
            } else if (count2 > count1) {
                if (aLead) return false;
                bLead = true;
            }
        }

        return true;
    }
}

/*
1433. Check If a String Can Break Another String
 */

package question;

public class Q796 {
    /*
    Time Complexity: O(mn)   Space Complexity: O(m)
     */
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).indexOf(goal) > 0;
    }
}

/*
796. Rotate String
 */

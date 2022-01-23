package question;

public class Q796 {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).indexOf(goal) > 0;
    }
}

/*
796. Rotate String
 */

package question;

public class Q331 {
    public boolean isValidSerialization(String preorder) {
        int diff = 1;

        String[] splits = preorder.split(",");
        for (String split : splits) {
            if (--diff < 0) {
                return false;
            } else if (!split.equals("#")) {
                diff += 2;
            }
        }

        return diff == 0;
    }
}

/*
331. Verify Preorder Serialization of a Binary Tree
 */

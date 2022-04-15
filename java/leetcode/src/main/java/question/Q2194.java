package question;

import java.util.ArrayList;
import java.util.List;

public class Q2194 {
    public List<String> cellsInRange(String s) {
        List<String> result = new ArrayList<>();

        char fromChar = s.charAt(0);
        char toChar = s.charAt(3);
        char fromNum = s.charAt(1);
        char toNum = s.charAt(4);

        for (char i = fromChar; i <= toChar; i++) {
            for (char j = fromNum; j <= toNum; j++) {
                result.add(String.valueOf(new char[]{i, j}));
            }
        }

        return result;
    }
}

/*
2194. Cells in a Range on an Excel Sheet
 */

package question;

import annotation.Array;
import annotation.Simulation;
import annotation.Stacks;

import java.util.ArrayList;
import java.util.List;

@Array
@Stacks
@Simulation
public class Q682 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int calPoints(String[] ops) {
        List<Integer> list = new ArrayList<>();

        for (String op : ops) {
            int size = list.size();
            if (op.equals("C")) {
                list.remove(size - 1);
            } else if (op.equals("D")) {
                list.add(list.get(size - 1) * 2);
            } else if (op.equals("+")) {
                list.add(list.get(size - 1) + list.get(size - 2));
            } else {
                list.add(Integer.parseInt(op));
            }
        }

        int result = 0;

        for (int num : list) {
            result += num;
        }

        return result;
    }
}

/*
682. Baseball Game
 */

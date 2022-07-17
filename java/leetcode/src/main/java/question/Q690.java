package question;

import java.util.*;

public class Q690 {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();

        for (Employee e : employees) {
            map.put(e.id, e);
        }

        int result = 0;
        Queue<Employee> q = new LinkedList<>();

        q.add(map.get(id));

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Employee e = q.poll();

                result += e.importance;

                for (Integer sub : e.subordinates) {
                    q.add(map.get(sub));
                }
            }
        }

        return result;
    }

    public int getImportance2(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();

        for (Employee e : employees) {
            map.put(e.id, e);
        }

        return helper(map, employees, id);
    }

    public int helper(Map<Integer, Employee> map, List<Employee> employees, int id) {
        Employee e = map.get(id);

        int sum = e.importance;

        for (int subordinate : e.subordinates) {
            sum += helper(map, employees, subordinate);
        }

        return sum;
    }

    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }
}

/*
690. Employee Importance
 */

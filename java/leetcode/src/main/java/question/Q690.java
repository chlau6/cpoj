package question;

import annotation.BreadthFirstSearch;
import annotation.DepthFirstSearch;
import annotation.HashTable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@HashTable
@DepthFirstSearch
@BreadthFirstSearch
public class Q690 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int getImportance(List<Employee> employees, int id) {
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

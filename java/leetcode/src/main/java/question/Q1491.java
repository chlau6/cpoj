package question;

import annotation.Array;
import annotation.Sorting;

@Array
@Sorting
public class Q1491 {
    /*
    Time Complexity: O(n)  Space Complexity: O(1)
     */
    public double average(int[] salary) {
        int maxSalary = Integer.MIN_VALUE;
        int minSalary = Integer.MAX_VALUE;
        int sum = 0;

        for (int s : salary) {
            maxSalary = Math.max(maxSalary, s);
            minSalary = Math.min(minSalary, s);
            sum += s;
        }

        return (sum - maxSalary - minSalary) / (salary.length - 2.0);
    }
}

/*
1491. Average Salary Excluding the Minimum and Maximum Salary
 */

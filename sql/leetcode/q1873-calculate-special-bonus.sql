SELECT employee_id, if(employee_id % 2 = 1 AND name NOT LIKE 'M%', salary, 0) as bonus
FROM Employees
ORDER BY employee_id
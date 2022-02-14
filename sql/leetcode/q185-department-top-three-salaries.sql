SELECT D.name AS Department, E1.name AS Employee, E1.Salary
FROM Employee E1
         JOIN Department D on E1.departmentId = D.id
WHERE (SELECT COUNT(DISTINCT E2.Salary) FROM Employee E2 WHERE E2.Salary > E1.Salary AND E2.departmentId = D.id) < 3
ORDER BY D.name, E1.salary DESC;
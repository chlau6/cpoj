SELECT D.name AS Department, E1.name AS Employee, E1.Salary
FROM Employee E1,
     Department D
WHERE E1.departmentId = D.id
  AND E1.salary = (SELECT MAX(E2.salary) FROM Employee E2 WHERE E2.departmentId = D.id);
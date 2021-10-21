SELECT E1.Name as Employee
FROM Employee E1
         INNER JOIN Employee E2 ON E1.ManagerId IS NOT NULL AND E2.Id = E1.ManagerId AND E1.Salary > E2.Salary;
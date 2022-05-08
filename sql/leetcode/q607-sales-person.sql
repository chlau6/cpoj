SELECT S.name
FROM Orders O
         JOIN Company C ON O.com_id = C.com_id AND C.name = 'RED'
         RIGHT JOIN SalesPerson S ON O.sales_id = S.sales_id
WHERE O.sales_id IS NULL;
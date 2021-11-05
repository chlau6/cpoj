SELECT D.id,
       SUM(CASE WHEN D.month = 'Jan' THEN D.revenue ELSE NULL END) AS Jan_Revenue,
       SUM(CASE WHEN D.month = 'Feb' THEN D.revenue ELSE NULL END) AS Feb_Revenue,
       SUM(CASE WHEN D.month = 'Mar' THEN D.revenue ELSE NULL END) AS Mar_Revenue,
       SUM(CASE WHEN D.month = 'Apr' THEN D.revenue ELSE NULL END) AS Apr_Revenue,
       SUM(CASE WHEN D.month = 'May' THEN D.revenue ELSE NULL END) AS May_Revenue,
       SUM(CASE WHEN D.month = 'Jun' THEN D.revenue ELSE NULL END) AS Jun_Revenue,
       SUM(CASE WHEN D.month = 'Jul' THEN D.revenue ELSE NULL END) AS Jul_Revenue,
       SUM(CASE WHEN D.month = 'Aug' THEN D.revenue ELSE NULL END) AS Aug_Revenue,
       SUM(CASE WHEN D.month = 'Sep' THEN D.revenue ELSE NULL END) AS Sep_Revenue,
       SUM(CASE WHEN D.month = 'Oct' THEN D.revenue ELSE NULL END) AS Oct_Revenue,
       SUM(CASE WHEN D.month = 'Nov' THEN D.revenue ELSE NULL END) AS Nov_Revenue,
       SUM(CASE WHEN D.month = 'Dec' THEN D.revenue ELSE NULL END) AS Dec_Revenue
FROM Department D
GROUP BY D.id
ORDER BY D.id
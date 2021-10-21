SELECT P.Email
From Person P
GROUP BY P.Email
HAVING COUNT(*) > 1;
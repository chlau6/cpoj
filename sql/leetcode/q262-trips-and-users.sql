SELECT T.request_at AS Day, ROUND(COUNT(IF(T.status != 'completed', TRUE, null)) / count(*), 2) AS 'Cancellation Rate'
FROM Trips T
WHERE T.client_id IN (SELECT U.users_id FROM Users U WHERE U.banned = 'NO')
  AND T.driver_id IN (SELECT U.users_id FROM Users U WHERE U.banned = 'NO')
  AND T.request_at between '2013-10-01'
  AND '2013-10-03'
GROUP BY T.request_at

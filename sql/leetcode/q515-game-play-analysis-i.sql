SELECT A.player_id, min(A.event_date) AS first_login
FROM Activity A
GROUP BY A.player_id
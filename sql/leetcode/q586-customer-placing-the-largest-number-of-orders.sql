SELECT O.customer_number
from Orders O
GROUP BY O.customer_number
ORDER BY COUNT(*) DESC LIMIT 1;
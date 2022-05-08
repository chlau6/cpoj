SELECT C.name
from Customer C
WHERE C.referee_id <> 2
   OR C.referee_id IS NULL;
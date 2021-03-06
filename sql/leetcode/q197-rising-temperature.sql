SELECT W1.Id AS id
FROM Weather W1,
     Weather W2
WHERE TO_DAYS(W1.RecordDate) - TO_DAYS(W2.RecordDate) = 1
  AND W1.Temperature > W2.Temperature;
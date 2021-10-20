package question;

import annotation.Database;

@Database
public class Q183 {
    /*
    SELECT C.Name AS Customers FROM Customers C LEFT JOIN Orders O ON C.Id = O.CustomerId WHERE O.CustomerId IS NULL
     */
}

/*
183. Customers Who Never Order
 */

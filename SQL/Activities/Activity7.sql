SELECT SUM(purchase_amount) AS "Total sum" FROM orders;


SELECT AVG(purchase_amount) AS "Average" FROM orders;


SELECT MAX(purchase_amount) AS "Maximum" FROM orders;


SELECT MIN(purchase_amount) AS "Minumum" FROM orders;


SELECT COUNT(DISTINCT salesman_id) AS "Total count" FROM orders; 
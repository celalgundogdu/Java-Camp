SELECT * FROM Customers;
SELECT ContactName, City FROM Customers;
SELECT ContactName name, City FROM Customers;

SELECT * FROM Customers WHERE City = 'London';
SELECT * FROM Products WHERE CategoryID=1 OR CategoryID=3;
SELECT * FROM Products WHERE CategoryID=1 AND Price>=10;

SELECT * FROM Products ORDER BY CategoryID, ProductName;
SELECT * FROM Products WHERE CategoryID=1 ORDER BY Price DESC;

SELECT COUNT(*) FROM Products;
SELECT COUNT(*) as Amount FROM Products WHERE CategoryID=2;

SELECT CategoryID, COUNT(*) as Amount FROM Products GROUP BY CategoryID;
SELECT CategoryID, COUNT(*) as Amount FROM Products GROUP BY CategoryID HAVING count(*)<10;
SELECT CategoryID, COUNT(*) as Amount FROM Products WHERE Price>20 GROUP BY CategoryID HAVING count(*)<10;

SELECT Products.ProductName, Products.Price, Categories.CategoryName FROM Products 
INNER JOIN Categories ON Products.CategoryID=Categories.CategoryID
WHERE Products.Price>10;

SELECT p.ProductName, p.Price FROM Products p
LEFT JOIN OrderDetails od ON p.ProductID=od.ProductID;

SELECT c.customerID, c.customerName FROM Customers c
LEFT JOIN Orders o ON c.customerID=o.customerID
WHERE o.customerID IS NULL

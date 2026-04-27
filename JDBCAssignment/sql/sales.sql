CREATE TABLE sales(id INT, bookName VARCHAR(100), quantity INT, price DOUBLE);
INSERT INTO sales VALUES (1,'Java Book',2,500);
SELECT * FROM sales WHERE quantity > 1;
UPDATE sales SET quantity=3 WHERE id=1;
DELETE FROM sales WHERE id=1;
